package workshop.oop.drive.cars;

import workshop.oop.drive.CarColour;
import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

public class Car implements Vehicle {

  private final CarColour color;

  public CarType carType;

  public long distanceMeter;

  VehicleParts.SteeringWheel steeringWheel;

  public Car(CarColour carColour) {
    color = carColour;
  }
  public Car() {
    this(CarColour.WHITE);
  }

  @Override
  public void driveForward(int kilometers) {

  }

  public String describeColor() {
    return color.getDescription();
  }
}
