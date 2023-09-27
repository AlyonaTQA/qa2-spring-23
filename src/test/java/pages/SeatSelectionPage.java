package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeatSelectionPage {

    private final By SEAT = By.xpath(".//div[@class = 'seat']");
    private final By BUTTON_BOOK2 = By.id("book3");

    private BaseFunc baseFunc;

    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public boolean selectSeat(int seatNumber) {

        baseFunc.waitForElementCountToBeAtLeast(SEAT, 15);
        List<WebElement> seats = baseFunc.findElements(SEAT);
        Assertions.assertFalse(seats.isEmpty(), "There is no seats at all!");

        boolean isSeatFound = false;
        for (WebElement seat : seats) {
            if (Integer.parseInt(seat.getText()) == seatNumber) {
                seat.click();
                isSeatFound = true;
                break;
            }
        }
        return isSeatFound;
    }

    public void checkSeat (boolean isSeatFound, int seatNumber) {
        Assertions.assertTrue(isSeatFound, "Seat Nr. " + seatNumber + " is not found!");
    }

    public void clickBookButton() {
        baseFunc.click(BUTTON_BOOK2);
    }

}
