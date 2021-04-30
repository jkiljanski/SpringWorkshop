package workshop.oop.drive.cars;

import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

public class Car implements Vehicle {

  private final CarType carType;

  private final CarColor color;

  public long distanceMeter;

  VehicleParts.SteeringWheel steeringWheel;

  public Car() {
    this(CarType.SEDAN, CarColor.WHITE);
  }

  public Car(CarType carType, CarColor color) {
    this.carType = carType;
    this.color = color;
  }



  @Override
  public void driveForward(int kilometers) {

  }


  public String describeMeYourColor() {
    return this.color.toString().toLowerCase();
  }

  public String describeMeYourType() {
    return this.carType.toString().toLowerCase();
  }

  String describeYourself() {
    return describeMeYourColor() + " " + describeMeYourType();
  }
}
