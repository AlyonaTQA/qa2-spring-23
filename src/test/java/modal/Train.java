package modal;

public class Train {
    private int fuelConsumption;
    private String model;

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public Train setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Train setModel(String model) {
        this.model = model;
        return this;
    }
}
