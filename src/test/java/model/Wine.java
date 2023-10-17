package model;

public class Wine {
    private String brand;
    private String country;
    private String type;
    private int volume;
    private int year;
    private double strength;
    private String color;
    private String grapeSort;

    public String getBrand() {
        return brand;
    }

    public Wine setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Wine setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getType() {
        return type;
    }

    public Wine setType(String type) {
        this.type = type;
        return this;
    }

    public double getVolume() {
        return volume;
    }

    public Wine setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Wine setYear(int year) {
        this.year = year;
        return this;
    }

    public double getStrength() {
        return strength;
    }

    public Wine setStrength(double strength) {
        this.strength = strength;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Wine setColor(String color) {
        this.color = color;
        return this;
    }

    public String getGrapeSort() {
        return grapeSort;
    }

    public Wine setGrapeSort(String grapeSort) {
        this.grapeSort = grapeSort;
        return this;
    }

    public void printVineDetails() {
        System.out.println(brand + " comes from " + country);
    }

    public void printVineInfo() {
        System.out.println("Average vine strength is " + strength + "% and usual volume is " + volume + " ml");
    }
}
