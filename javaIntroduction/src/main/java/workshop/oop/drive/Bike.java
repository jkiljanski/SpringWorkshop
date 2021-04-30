package workshop.oop.drive;

public class Bike implements Vehicle {

  private final  FuelType fuelType;

  public Bike() {
    this.fuelType = FuelType.MANUAL;
  }

  @Override
  public void driveForward(int kilometers) {

  }

  @Override
  public FuelType getFuelType() {
    return fuelType;
  }
}
