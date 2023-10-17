package model;

public class Bicycle {
    private String name;
    private String frameType;
    private int frameSize;
    private String color;
    private int speedCount;
    private double wheelDiameter;
    private String breakType;

    public String getName() {
        return name;
    }

    public Bicycle setName(String name) {
        this.name = name;
        return this;
    }

    public String getFrameType() {
        return frameType;
    }

    public Bicycle setFrameType(String frameType) {
        this.frameType = frameType;
        return this;
    }

    public int getFrameSize() {
        return frameSize;
    }

    public Bicycle setFrameSize(int frameSize) {
        this.frameSize = frameSize;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Bicycle setColor(String color) {
        this.color = color;
        return this;
    }

    public int getSpeedCount() {
        return speedCount;
    }

    public Bicycle setSpeedCount(int speedCount) {
        this.speedCount = speedCount;
        return this;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public Bicycle setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
        return this;
    }

    public String getBreakType() {
        return breakType;
    }

    public Bicycle setBreakType(String breakType) {
        this.breakType = breakType;
        return this;
    }

    public void printBikeColor() {
        System.out.println("I have " + color + " color bike");
    }

    public void printBikeSpeed() {
        System.out.println("Bike has " + speedCount + " speeds");
    }

}
