package workshop.oop.drive.cars;

public class CarSeller {

  public String describe(Car car) {

    return String.format("Car is a %s %s",car.describeMeYourColor(), car.describeMeYourType());
  }
}
