package workshop.oop.drive;


import io.vavr.Function1;

public class VehicleTrip {

    private final Vehicle vehicle;
    private final int length;

    public VehicleTrip(Vehicle vehicle, int length) {

        this.vehicle = vehicle;
        this.length = length;
    }

    public void doTrip() {

    }

    public float calculateCost() {
        float price = vehicle.getFuelType().getPrice();

        if (vehicle.getFuelType() == FuelType.MANUAL) {
            return 0;
        }
        if(vehicle.getFuelType() == FuelType.GAS)
        return 5f * 8 * this.length / 100;

        if(vehicle.getFuelType() == FuelType.MANUAL)
        return 123f;

        throw new IllegalStateException("This should happen");
    }
}
