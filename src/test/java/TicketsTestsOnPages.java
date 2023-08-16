import modal.ReservationInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

public class TicketsTestsOnPages extends BaseSeleniumTests{
    private final String URL = "www.qaguru.lv:8089/tickets/";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";
    private int seatNumber = 28;
    private ReservationInfo info = new ReservationInfo("Alyona", "Vasjucenko", "ccccc", 4, 1,1, "11-05-2018");

    @Test
    public void successTicketsBookCheck() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openUrl(URL);

        HomePage homePage = new HomePage(baseFunc);
        homePage.selectDepartureAirport(DEPARTURE_AIRPORT);
        homePage.selectArrivalAirport(ARRIVAL_AIRPORT);
        homePage.clickGoGoGoBtn();

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(info);
        infoPage.clickGetPriceLink();
        Assertions.assertEquals(DEPARTURE_AIRPORT, infoPage.getAirport(0), "Wrong Departure Airport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, infoPage.getAirport(1), "Wrong Arrival Airport!");
        Assertions.assertEquals(info.getFirstName(), infoPage.getName().substring(0, infoPage.getName().length() -1));
        Assertions.assertEquals(DEPARTURE_AIRPORT, infoPage.getAirport(3), "Wrong Departure Airport!");
        Assertions.assertEquals(ARRIVAL_AIRPORT, infoPage.getAirport(4), "Wrong Arrival Airport!");
        infoPage.clickBookButton();

        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNumber);
        seatSelectionPage.clickBookButton();

        ThankYouPage thankYouPage = new ThankYouPage(baseFunc);
        thankYouPage.checkFinalText();

    }
}
