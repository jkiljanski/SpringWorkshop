package workshop.oop.drive.cars;

import workshop.oop.drive.CarColour;
import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

public class Car implements Vehicle {

  private final CarColour color;

  private final CarType carType;

  public long distanceMeter;

  VehicleParts.SteeringWheel steeringWheel;

  public Car(CarColour carColour) {
    this(carColour, CarType.SEDAN);
  }
  public Car() {
    this(CarColour.WHITE);

  }

  public Car(CarColour colour , CarType carType) {
    color = colour;
    this.carType = carType;
  }

  @Override
  public void driveForward(int kilometers) {

  }

  public String describeColor() {
    return color.getDescription();
  }

  public String describeType() {
    return carType.name().toLowerCase();
  }
}
