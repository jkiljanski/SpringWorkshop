package workshop.oop.drive;

import com.google.common.base.Function;

import java.util.Map;

public class VehicleTrip {

    private final Vehicle vehicle;
    private final int length;
    double costs;

    public VehicleTrip(Vehicle vehicle, int length) {
        this.vehicle = vehicle;
        this.length = length;
    }

    public void doTrip() {
        vehicle.driveForward(length);

    }

    public int calculateCost(Map<FuelType, Function<Fuel, Integer>> costOfFuelMap){

        Fuel fuelUsed = vehicle.fuelUsed();

        Function<Fuel, Integer> fuelIntegerFunction = costOfFuelMap.get(fuelUsed.fuelType);

        if(fuelIntegerFunction == null){
            throw new RuntimeException("The is no cost function for " + fuelUsed.fuelType);
        }
        Integer cost = fuelIntegerFunction.apply(fuelUsed);

        return cost;
    }
}
