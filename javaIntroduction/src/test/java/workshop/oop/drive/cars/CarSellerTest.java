package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import workshop.oop.drive.CarColour;


public class CarSellerTest {

  CarSeller carSeller = new CarSeller();

  @Test
  public void describesSingleCar() {
    //given
    Car car = new Car(CarColour.BLUE);
    car.carType = CarType.SEDAN;

    //when
    String description = carSeller.describe(car);

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan");
  }

  @Test
  public void describeCoupleOfCars() {
    //given
    Car car1 = new Car(CarColour.BLUE);
    car1.carType = CarType.SEDAN;

    Car car2 = new Car(CarColour.BLACK);
    car2.carType = CarType.COMBI;


    //when
    String description = carSeller.describe(car1/*, car2*/);

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
  }

  @Test
  public void describeCoupleOfCarsAsList() {
    //given
    Car car1 = new Car(CarColour.BLUE);
    car1.carType = CarType.SEDAN;

    Car car2 = new Car(CarColour.BLACK);
    car2.carType = CarType.COMBI;


    //when
    List<Car> objects = List.of(car1, car2);
    String description = carSeller.describe(null); //put it in here

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
  }

  @Test
  public void describeACarWithDetails() {
    //given
    Car car = new Car(CarColour.BLUE); //add steering wheel,
    car.carType = CarType.SEDAN;

    //when
    List<Car> objects = List.of(car);
    String description = carSeller.describe/*WithDetails*/(car); //put it in here

    //then
    assertThat(description).isEqualTo("Car is a blue sedan with black and white tires and ceramic breaks and chromed steering wheel");
  }
}
