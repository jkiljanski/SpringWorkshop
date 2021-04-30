package workshop.oop.drive.cars;

public class CarSeller {

  public String describe(Car car) {

    return String.format("Car is a %s", car.describeYourself());
  }

  public String describe(Car... cars) {
    String result="";
    for (int j = 0; j < cars.length; j++) {
      result += String.format("Car#%s is a %s, ", j+1, cars[j].describeYourself());
    }
    return result.substring(0, result.length()-2);
  }
}
