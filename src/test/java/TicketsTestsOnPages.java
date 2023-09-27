import modal.tickets.Flight;
import modal.tickets.Passenger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class TicketsTestsOnPages extends BaseSeleniumTests{
    private final String URL = "www.qaguru.lv:8089/tickets/";
    private Passenger passenger = new Passenger("Alyona", "Vasjucenko");
    private Flight flight = new Flight("RIX", "MEL", "ccccc", 4, 1,
            1, "11-05-2018", 28);
    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(flight, passenger);
        infoPage.clickGetPriceLink();
        Assertions.assertEquals(flight.getDeparture(), infoPage.getAirport(0), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getAirport(1), "Wrong Arrival Airport!");
        Assertions.assertEquals(passenger.getFirstName(), infoPage.getName().substring(0, infoPage.getName().length() -1));
        Assertions.assertEquals(flight.getDeparture(), infoPage.getAirport(3), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getAirport(4), "Wrong Arrival Airport!");
        infoPage.clickBookButton();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        boolean isSeatFound = seatSelectionPage.selectSeat(flight.getSeatNr());
        seatSelectionPage.checkSeat(isSeatFound, flight.getSeatNr());
        seatSelectionPage.clickBookButton();

        ThankYouPage thankYouPage = new ThankYouPage(baseFunc);
        thankYouPage.checkFinalText();

    }
}
