package workshop.oop.drive.cars;

import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

public class Car implements Vehicle {

  public CarType carType;

  private final CarColor color;

  public long distanceMeter;

  VehicleParts.SteeringWheel steeringWheel;

  public Car() {
    this(CarColor.WHITE);
  }

  public Car(CarColor color) {
    this.color = color;
  }

  @Override
  public void driveForward(int kilometers) {

  }


  public String describeMeYourColor() {
    return this.color.toString().toLowerCase();
  }
}
