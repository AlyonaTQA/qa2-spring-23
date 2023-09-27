package pages;

import modal.tickets.Flight;
import modal.tickets.Passenger;
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

    public void fillInPassengerInfo(Flight flight, Passenger passenger){
        baseFunc.type(NAME_INPUT, passenger.getFirstName());
        baseFunc.type(SURNAME_INPUT, passenger.getLastName());
        baseFunc.type(DISCOUNT_INPUT, flight.getDiscount());
        baseFunc.type(ADULTS_INPUT, flight.getPassengersCount());
        baseFunc.type(CHILDREN_INPUT, flight.getChildCount());
        baseFunc.type(BAGS_INPUT, flight.getLuggageCount());
        baseFunc.selectByText(FLIGHT_INPUT, flight.getFlightDate());
    }

    public void clickGetPriceLink() {
        baseFunc.click(GET_PRICE_LINK);
    }

    public String getAirport(int number) {
        List<WebElement> airport = baseFunc.findElements(FLIGHT_INFO);
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
