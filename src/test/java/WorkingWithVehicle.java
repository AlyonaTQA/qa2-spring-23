import model.Airplane;
import model.Car;
import model.Route;
import model.Train;
import org.junit.jupiter.api.Test;

public class WorkingWithVehicle {
    @Test
    public void vehicleDetails(){
        Car car = new Car();
        car.setModel("RAV4");
        car.setFuelConsumption(12);
        Airplane airplane = new Airplane();
        airplane.setModel("Boeing 737");
        airplane.setFuelConsumption(1200);
        Train train = new Train();
        train.setModel("MegaTrain");
        train.setFuelConsumption(400);
        Route route = new Route();
        route.setLength(1000);
        FuelCalculator fuelCalculator = new FuelCalculator();
        fuelCalculator.calculate(car, route.getLength());
        fuelCalculator.calculate(train, route.getLength());
        fuelCalculator.calculate(airplane, route.getLength());
    }
}
