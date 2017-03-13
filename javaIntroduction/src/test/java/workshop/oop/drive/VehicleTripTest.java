package workshop.oop.drive;

import com.google.common.base.Function;
import org.junit.Before;
import org.junit.Test;
import workshop.oop.drive.cars.Car;
import workshop.oop.drive.cars.ElectricCar;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTripTest {
    private static final double ELECTRICITY_COST = 0.5;
    private static final int GAS_COST = 5;
    private static final int MANUAL_COST = 0;
    private Map<FuelType, Function<Fuel, Integer>> costMap=new HashMap<>();

    @Before
    public void setUp(){
        costMap.put(FuelType.MANUAL, createFunction(MANUAL_COST)) ;
        costMap.put(FuelType.GAS, createFunction(GAS_COST)) ;
        costMap.put(FuelType.ELECTRICITY, createFunction(ELECTRICITY_COST)) ;
    }

    private Function<Fuel, Integer> createFunction(final double cost) {
        return new Function<Fuel, Integer>() {
            @Override
            public Integer apply(Fuel input) {
                return (int)(input.amount*cost);
            }
        };
    }


    @Test
    public void calculateCostOfRidingBike(){
        //given
        VehicleTrip vehicleTrip = new VehicleTrip(new Bike(), 100);

        //when
        vehicleTrip.doTrip();

        //then
        assertThat(vehicleTrip.calculateCost(costMap)).isEqualTo(0);
    }

    @Test
    public void calculateCostOfACarRide(){
        //given
        VehicleTrip vehicleTrip = new VehicleTrip(new Car(), 100);

        //when
        vehicleTrip.doTrip();

        //then
        //TODO 100km uses 7liters per 5 zlotys each - implement null
        assertThat(vehicleTrip.calculateCost(costMap)).isEqualTo(35);
    }

    @Test
    public void calculateCostOfAElectricCarRide(){
        //given
        //TODO: set up engine
        VehicleTrip vehicleTrip = new VehicleTrip(new ElectricCar(), 100);

        //when
        vehicleTrip.doTrip();

        //then
        //TODO 100km uses 20kWh per 0,5 zlotys each - implement null
        assertThat(vehicleTrip.calculateCost(costMap)).isEqualTo(10);
    }
}
