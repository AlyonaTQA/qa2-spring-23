import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketsTests extends BaseSeleniumTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By BUTTON_GO = By.xpath(".//span[@class='gogogo']");

    private final By SELECTED_AIRPORT = By.xpath(".//span[@class = 'bTxt']");
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULTS_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By BAGS_INPUT = By.id("bugs");
    private final By FLIGHT_INPUT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");
    private final By FLIGHT_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE = By.id("response");
    private final By BUTTON_BOOK1 = By.id("book2");
    private final By BUTTON_BOOK2 = By.id("book3");
    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By FINAL_TEXT = By.xpath(".//div[@class = 'finalTxt']");

    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";

    private final String NAME = "Alyona";
    private final String SURNAME = "Vasjucenko";
    private final int DISCOUNT = 12345;
    private final int ADULTS = 1;
    private final int CHILDREN = 0;
    private final int BAGS = 2;
    private final int FLIGHT = 13;
    private final int SEAT_NUMBER = 13;


    @Test
    public void successTicketsBookCheck() {
        //Open browser
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        //Open Home Page
        browser.get(URL);

        //Select Departure airport
        WebElement fromDropdown = browser.findElement(FROM);
        Select fromSelect = new Select(fromDropdown);
        fromSelect.selectByValue(DEPARTURE_AIRPORT);

        //Select Arrival airport
        WebElement toDropdown = browser.findElement(TO);
        Select toSelect = new Select(toDropdown);
        toSelect.selectByValue(ARRIVAL_AIRPORT);

        //Press GoGoGo btn
        browser.findElement(BUTTON_GO).click();

        //Check if selected airport appears
        List<WebElement> selectedAirports = browser.findElements(SELECTED_AIRPORT);
        System.out.println("First airport " + selectedAirports.get(0).getText());
        System.out.println("Second airport " + selectedAirports.get(1).getText());

        //Fill in passenger personal info
        WebElement nameInputField = browser.findElement(NAME_INPUT);
        nameInputField.clear();
        nameInputField.sendKeys(NAME);
        WebElement surnameInputField = browser.findElement(SURNAME_INPUT);
        surnameInputField.clear();
        surnameInputField.sendKeys(SURNAME);
        WebElement discountField = browser.findElement(DISCOUNT_INPUT);
        discountField.clear();
        discountField.sendKeys(String.valueOf(DISCOUNT));
        WebElement adultsField = browser.findElement(ADULTS_INPUT);
        adultsField.clear();
        adultsField.sendKeys(String.valueOf(ADULTS));
        WebElement childrenField = browser.findElement(CHILDREN_INPUT);
        childrenField.clear();
        childrenField.sendKeys(String.valueOf(CHILDREN));
        WebElement bagsField = browser.findElement(BAGS_INPUT);
        bagsField.clear();
        bagsField.sendKeys(String.valueOf(BAGS));
        WebElement flightField = browser.findElement(FLIGHT_INPUT);
        Select flight = new Select(flightField);
        flight.selectByValue(String.valueOf(FLIGHT));

        //Press Get Price link
        browser.findElement(GET_PRICE_LINK).click();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(FLIGHT_INFO, 5));

        List<WebElement> flightInfo = browser.findElements(FLIGHT_INFO);
        Assertions.assertEquals(DEPARTURE_AIRPORT, flightInfo.get(0).getText(), "Wrong Departure Airport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, flightInfo.get(1).getText(), "Wrong arrival Airport!");

        String name = flightInfo.get(2).getText();
        Assertions.assertEquals(NAME, name.substring(0, name.length() -1), "Wrong Name!");

        Assertions.assertEquals(DEPARTURE_AIRPORT, flightInfo.get(3).getText(), "Wrong Departure Airport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, flightInfo.get(4).getText(), "Wrong arrival Airport!");

        String rawText = browser.findElement(RESPONSE).getText();
        Matcher matcher = Pattern.compile("\\d+").matcher(rawText);
        if (matcher.find()) {
            int firstDigitPrice = Integer.parseInt(matcher.group());
            Assertions.assertEquals(1040, firstDigitPrice, "Wrong price!");

        } else {
            Assertions.fail("price not found");
        }

        //Press Book btn
        browser.findElement(BUTTON_BOOK1).click();

        //Select seat Nr
        browser.findElements(SEAT).get(SEAT_NUMBER).click();

        //Press Book btn
        browser.findElement(BUTTON_BOOK2).click();

        //Check if successful message appears
        wait.until(ExpectedConditions.presenceOfElementLocated(FINAL_TEXT));
        WebElement finalText = browser.findElement(FINAL_TEXT);
        Assertions.assertEquals( "Thank You for flying with us!", finalText.getText(), "Wrong text!");
    }
}