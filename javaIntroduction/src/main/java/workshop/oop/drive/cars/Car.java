package workshop.oop.drive.cars;

import workshop.oop.drive.Fuel;
import workshop.oop.drive.FuelType;
import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

public class Car implements Vehicle {
    private static final int GAS_USAGE=7;
    public String color;

    public CarType carType;

    public long distanceMeter;


    public Fuel fuelUsed = createFuelUsed();

    protected Fuel createFuelUsed() {
        return new Fuel(FuelType.GAS);
    }

    VehicleParts.SteeringWheel steeringWheel;

    @Override
    public void driveForward(int kilometers) {
        fuelUsed.amount=(kilometers/100)*GAS_USAGE;

    }

    @Override
    public Fuel fuelUsed() {
        return fuelUsed;
    }

}
