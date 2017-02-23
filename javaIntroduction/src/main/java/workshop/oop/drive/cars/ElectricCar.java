package workshop.oop.drive.cars;

import workshop.oop.drive.Fuel;
import workshop.oop.drive.FuelType;

public class ElectricCar extends Car {

    private static final int ELECTRIC_USAGE = 20;

    @Override
    public void driveForward(int kilometers) {
        fuelUsed.amount=(kilometers/100)*ELECTRIC_USAGE;

    }

    protected Fuel createFuelUsed() {
        return new Fuel(FuelType.ELECTRICITY);
    }
}
