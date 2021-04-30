package workshop.oop.drive.cars;

import io.vavr.collection.List;
import workshop.oop.drive.Vehicle;
import workshop.oop.drive.VehicleParts;

import java.util.stream.Collectors;

public class Car implements Vehicle {

  private final CarType carType;

  private final CarColor color;

  public long distanceMeter;

  VehicleParts.SteeringWheel steeringWheel;

  public Car() {
    this(CarType.SEDAN, CarColor.WHITE);
  }

  public Car(CarType carType, CarColor color, VehicleParts ... vehicleParts) {
    this.carType = carType;
    this.color = color;
  }



  @Override
  public void driveForward(int kilometers) {

  }

  public String describeMeYourColor() {
    return this.color.describeYourself();
  }


  String describeYourself() {
    return List.of(color, carType)
            .map(CarElementDescribable::describeYourself)
            .collect(Collectors.joining(" "));
  }
}
