package model;

public class Mobile {
    private String brand;
    private String model;
    private String color;
    private String platform;
    private double screenSize;
    private int year;
    private int batteryCapacity;

    public String getBrand() {
        return brand;
    }

    public Mobile setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Mobile setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Mobile setColor(String color) {
        this.color = color;
        return this;
    }

    public String getPlatform() {
        return platform;
    }

    public Mobile setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public Mobile setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Mobile setYear(int year) {
        this.year = year;
        return this;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public Mobile setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public void printMobileInfo() {
        System.out.println("My phone brand is " + brand + " and model is " + model);
    }

    public void printMobileDetails() {
        System.out.println("Platform is " + platform + " and screen size is " + screenSize + " inch");
    }
}
