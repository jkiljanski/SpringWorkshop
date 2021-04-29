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

  public int calculateCost() {

    return 0;
  }
}
