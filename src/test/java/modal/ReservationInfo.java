package modal;

public class ReservationInfo {
    private String firstName;
    private String lastName;
    private String discount;
    private int passengerCount;
    private int childCount;
    private int bagsCount;
    private String flightDate;

    public ReservationInfo(String firstName, String lastName, String discount, int passengerCount, int childCount, int bagsCount, String flightDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.discount = discount;
        this.passengerCount = passengerCount;
        this.childCount = childCount;
        this.bagsCount = bagsCount;
        this.flightDate = flightDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public ReservationInfo setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ReservationInfo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDiscount() {
        return discount;
    }

    public ReservationInfo setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public ReservationInfo setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
        return this;
    }

    public int getChildCount() {
        return childCount;
    }

    public ReservationInfo setChildCount(int childCount) {
        this.childCount = childCount;
        return this;
    }

    public int getBagsCount() {
        return bagsCount;
    }

    public ReservationInfo setBagsCount(int bagsCount) {
        this.bagsCount = bagsCount;
        return this;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public ReservationInfo setFlightDate(String flightDate) {
        this.flightDate = flightDate;
        return this;
    }
}
