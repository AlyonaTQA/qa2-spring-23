package model.tickets;

public class Flight {
    private String departure;
    private String arrival;
    private String discount;
    private int passengersCount;
    private int childCount;
    private int luggageCount;
    private String flightDate;
    private int seatNr;

    public Flight(String departure, String arrival, String discount, int passengersCount, int childCount, int luggageCount, String flightDate, int seatNr) {
        this.departure = departure;
        this.arrival = arrival;
        this.discount = discount;
        this.passengersCount = passengersCount;
        this.childCount = childCount;
        this.luggageCount = luggageCount;
        this.flightDate = flightDate;
        this.seatNr = seatNr;
    }

    public Flight() {}

    public String getDeparture() {
        return departure;
    }

    public Flight setDeparture(String departure) {
        this.departure = departure;
        return this;
    }

    public String getArrival() {
        return arrival;
    }

    public Flight setArrival(String arrival) {
        this.arrival = arrival;
        return this;
    }

    public String getDiscount() {
        return discount;
    }

    public Flight setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public Flight setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
        return this;
    }

    public int getChildCount() {
        return childCount;
    }

    public Flight setChildCount(int childCount) {
        this.childCount = childCount;
        return this;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public Flight setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
        return this;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public Flight setFlightDate(String flightDate) {
        this.flightDate = flightDate;
        return this;
    }

    public int getSeatNr() {
        return seatNr;
    }

    public Flight setSeatNr(int seatNr) {
        this.seatNr = seatNr;
        return this;
    }
}
