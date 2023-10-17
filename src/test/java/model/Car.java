package model;

public class Car {
    private String hullType;
    private int fuelConsumption;
    private String model;
    private String brandName;
    private String color;
    private String fuelType;
    private String country;
    private int year;

    public String getHullType() {
        return hullType;
    }

    public Car setHullType(String hullType) {
        this.hullType = hullType;
        return this;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Car setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public Car setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Car setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Car setCountry(String country) {
        this.country = country;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public void printCarInfo() {
        System.out.println(brandName + " has big " + hullType + " range to offer");
    }

    public void printCarDetails() {
        System.out.println("Car has " + color + " color and " + year + " year of manufacture");
    }
}
