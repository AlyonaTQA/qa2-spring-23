package pages;

import modal.ReservationInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PassengerInfoPage {
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_INPUT = By.id("discount");
    private final By ADULTS_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By BAGS_INPUT = By.id("bugs");
    private final By FLIGHT_INPUT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");

    private final By FLIGHT_INFO = By.xpath(".//span[@class = 'bTxt']");



    private final By BUTTON_BOOK1 = By.id("book2");
    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(ReservationInfo reservationInfo){
        baseFunc.type(NAME_INPUT, reservationInfo.getFirstName());
        baseFunc.type(SURNAME_INPUT, reservationInfo.getLastName());
        baseFunc.type(DISCOUNT_INPUT, reservationInfo.getDiscount());
        baseFunc.type(ADULTS_INPUT, reservationInfo.getPassengerCount());
        baseFunc.type(CHILDREN_INPUT, reservationInfo.getChildCount());
        baseFunc.type(BAGS_INPUT, reservationInfo.getBagsCount());
        baseFunc.selectByText(FLIGHT_INPUT, reservationInfo.getFlightDate());
    }

    public void clickGetPriceLink() {
        baseFunc.click(GET_PRICE_LINK);
    }

    public String getAirport(int number) {
        List<WebElement> airport = baseFunc.findElementsNumber(FLIGHT_INFO);
        return airport.get(number).getText();
    }

    public String getName(){
        List<WebElement> name = baseFunc.findElements(FLIGHT_INFO);
        return name.get(2).getText();
    }

    public void clickBookButton() {
        baseFunc.click(BUTTON_BOOK1);
    }

}
