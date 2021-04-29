package workshop.oop.drive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import workshop.oop.drive.cars.Car;

public class VehicleTripTest {

  @Test
  public void calculateCostOfRidingBike() {
    //given
    VehicleTrip vehicleTrip = new VehicleTrip(new Bike(), 100);

    //when
    vehicleTrip.doTrip();

    //then
    assertThat(vehicleTrip.calculateCost()).isEqualTo(0);
  }

  @Test
  public void calculateCostOfACarRide() {
    //given
    VehicleTrip vehicleTrip = new VehicleTrip(new Car(), 240);

    //when
    vehicleTrip.doTrip();

    //then
    //TODO 100km uses 8liters per 5 zlotys each - implement null
    //assertThat(vehicleTrip.calculateCost(null)).isEqualTo(96);
  }

  @Test
  public void calculateCostOfAElectricCarRide() {
    //given
    //TODO: set up engine
    VehicleTrip vehicleTrip = new VehicleTrip(new Car(), 240);

    //when
    vehicleTrip.doTrip();

    //then
    //TODO 100km uses 30kWh per 0,5 zlotys each - implement null
    assertThat(vehicleTrip.calculateCost()).isEqualTo(36);
  }
}
