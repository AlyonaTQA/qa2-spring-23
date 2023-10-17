import model.Airplane;
import model.Car;
import model.Train;

public class FuelCalculator {
    public void calculate(Car car, int length) {
        int fuelPerRoute = car.getFuelConsumption() * length/100; // required per 100km
        System.out.println(car.getModel() + " to cover " + length + "km, fuel required: " + fuelPerRoute + " liters, fuel per 100 km used is: " + car.getFuelConsumption() + " liters");
    }

    public void calculate(Train train, int length) {
        int fuelPerRoute = train.getFuelConsumption() * length/100; // required per 100km
        System.out.println(train.getModel() + " to cover " + length + "km, fuel required: " + fuelPerRoute + " liters, fuel per 100 km used is: " + train.getFuelConsumption() + " liters");
    }

    public void calculate(Airplane airplane, int length) {
        int fuelPerRoute = airplane.getFuelConsumption() * length/100; // required per 100km
        System.out.println(airplane.getModel() + " to cover " + length + "km, fuel required: " + fuelPerRoute + " liters, fuel per 100 km used is: " + airplane.getFuelConsumption() + " liters");
    }
    
}
