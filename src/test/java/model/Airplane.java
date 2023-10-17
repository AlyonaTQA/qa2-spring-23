package model;

public class Airplane {
    private int fuelConsumption;
    private String model;

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Airplane setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Airplane setModel(String model) {
        this.model = model;
        return this;
    }
}
