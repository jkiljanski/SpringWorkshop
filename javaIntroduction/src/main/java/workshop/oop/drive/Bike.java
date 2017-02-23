package workshop.oop.drive;

public class Bike implements Vehicle {
    @Override
    public void driveForward(int kilometers) {

    }

    @Override
    public Fuel fuelUsed() {
        return new Fuel(FuelType.MANUAL);
    }
}
