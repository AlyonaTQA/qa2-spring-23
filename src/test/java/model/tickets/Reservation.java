package model.tickets;

public class Reservation {
    private long id;
    private String name;
    private String surname;
    private String afrom;
    private String ato;
    private String discount;
    private int bugs;
    private int children;
    private int flight;
    private int adults;
    private int seat;

    public long getId() {
        return id;
    }

    public Reservation setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Reservation setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Reservation setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getAfrom() {
        return afrom;
    }

    public Reservation setAfrom(String afrom) {
        this.afrom = afrom;
        return this;
    }

    public String getAto() {
        return ato;
    }

    public Reservation setAto(String ato) {
        this.ato = ato;
        return this;
    }

    public String getDiscount() {
        return discount;
    }

    public Reservation setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    public int getBugs() {
        return bugs;
    }

    public Reservation setBugs(int bugs) {
        this.bugs = bugs;
        return this;
    }

    public int getChildren() {
        return children;
    }

    public Reservation setChildren(int children) {
        this.children = children;
        return this;
    }

    public int getFlight() {
        return flight;
    }

    public Reservation setFlight(int flight) {
        this.flight = flight;
        return this;
    }

    public int getAdults() {
        return adults;
    }

    public Reservation setAdults(int adults) {
        this.adults = adults;
        return this;
    }

    public int getSeat() {
        return seat;
    }

    public Reservation setSeat(int seat) {
        this.seat = seat;
        return this;
    }
}
