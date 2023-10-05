package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modal.tickets.Flight;
import modal.tickets.Passenger;
import modal.tickets.Reservation;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.*;
import requesters.TicketsRequester;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketsStepDefs {
    private Passenger passenger = new Passenger();
    private Flight flight = new Flight();
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private PassengerInfoPage infoPage;
    private SeatSelectionPage seatSelectionPage;
    private ThankYouPage thankYouPage;
    private List<Reservation> reservations;
    private Reservation reservationFromApi;

    @Given("airports:")
    public void set_airports(Map<String, String> params) {
        flight.setDeparture(params.get("from"));
        flight.setArrival(params.get("to"));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params) {
        passenger.setFirstName(params.get("first_name"));
        passenger.setLastName(params.get("last_name"));
    }

    @Given("flight info is:")
    public void set_flight_info(Map<String, String> params) {
        flight.setDiscount(params.get("discount"));
        flight.setPassengersCount(Integer.parseInt(params.get("passengers_count")));
        flight.setChildCount(Integer.parseInt(params.get("child_count")));
        flight.setLuggageCount(Integer.parseInt(params.get("luggage_count")));
        flight.setFlightDate(params.get("flight_date"));
        flight.setSeatNr(Integer.parseInt(params.get("seat_nr")));
    }

    @Given("home page is opened")
    public void open_home_page() {
        baseFunc.openUrl("qaguru.lv:8089/tickets");
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectDepartureAirport(flight.getDeparture());
        homePage.selectArrivalAirport(flight.getArrival());
        homePage.clickGoGoGoBtn();
        infoPage = new PassengerInfoPage(baseFunc);
    }

    @Then("selected airports appears on the passenger info page")
    public void check_selected_airports() {
        Assertions.assertEquals(flight.getDeparture(), infoPage.getAirport(0, 2), "Wrong departure airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getAirport(1, 2), "Wrong arrival airport!");
    }

    @When("we are filling in passenger info")
    public void fill_in_flight_info() {
        infoPage.fillInPassengerInfo(flight, passenger);
    }

    @When("requesting price")
    public void click_requesting_price() {
        infoPage.clickGetPriceLink();
    }

    @Then("airports and price appears in flight details")
    public void check_flight_details() {
        Assertions.assertEquals(flight.getDeparture(), infoPage.getAirport(3, 5), "Wrong Departure Airport!");
        Assertions.assertEquals(flight.getArrival(), infoPage.getAirport(4, 5), "Wrong Arrival Airport!");

        final By RESPONSE = By.id("response");
        String rawText = baseFunc.findElement(RESPONSE).getText();
        Matcher matcher = Pattern.compile("\\d+").matcher(rawText);
        if (matcher.find()) {
            int firstDigitPrice = Integer.parseInt(matcher.group());
            Assertions.assertEquals(1860, firstDigitPrice, "Wrong price!");

        } else {
            Assertions.fail("price not found");
        }
    }

    @When("we are confirming price")
    public void click_on_book_button() {
        infoPage.clickBookButton();
    }

    @When("selecting seat number")
    public void select_seat_number() {
        seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(flight.getSeatNr());
    }

    @Then("selected sit number appears")
    public void seat_number_check() {
        seatSelectionPage.checkSeat(true, flight.getSeatNr());
    }

    @When("we are confirming seat")
    public void book_button_click() {
        seatSelectionPage.clickBookButton();
    }

    @Then("successful registration message appears")
    public void successful_registration_message_check() {
        thankYouPage = new ThankYouPage(baseFunc);
        thankYouPage.checkFinalText();
    }

    @When("we are requesting all reservations via API")
    public void request_all_reservations() throws JsonProcessingException {
        TicketsRequester requester = new TicketsRequester();
        reservations = requester.getReservations();
    }

    @Then("current reservation exists in the list")
    public void find_reservation() {
        for (Reservation reservation : reservations) {
            if (reservation.getName().equals(passenger.getFirstName())) {
                reservationFromApi = reservation;
                break;
            }
        }
        Assertions.assertNotNull(reservationFromApi, "Can't find reservation!");
    }

    @Then("all data are stored correctly")
    public void check_reservation_data() {
        Assertions.assertEquals(passenger.getLastName(), reservationFromApi.getSurname(), "Wrong Last name!");
        Assertions.assertEquals(flight.getDiscount(), reservationFromApi.getDiscount(), "Wrong Discount!");
        Assertions.assertEquals(flight.getPassengersCount(), reservationFromApi.getAdults(), "Wrong Passengers Count!");
        Assertions.assertEquals(flight.getChildCount(), reservationFromApi.getChildren(), "Wrong Children Count!");
        Assertions.assertEquals(flight.getLuggageCount(), reservationFromApi.getBugs(), "Wrong Bags Count!");
        Assertions.assertEquals(Integer.parseInt(flight.getFlightDate().substring(0, 2)), reservationFromApi.getFlight(), "Wrong Flight Date!");
        Assertions.assertEquals(flight.getSeatNr(), reservationFromApi.getSeat(), "Wrong Seat Nr!");
    }
}
