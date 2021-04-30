package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.*;


@DisplayName("Salesman trying to sell us cars")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarSellerTest {

  CarSeller carSeller = new CarSeller();

  @Order(1)
  @Test
  public void describesSingleCar() {
    //given
    Car car = new Car();
    car.carType = CarType.SEDAN;
    car.color = "blue";

    //when
    String description = carSeller.describe(car);

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan");
  }

  @Order(2)
  @Test
  public void describeCoupleOfCars() {
    //given
    Car car1 = new Car();
    car1.carType = CarType.SEDAN;
    car1.color = "blue";

    Car car2 = new Car();
    car2.carType = CarType.COMBI;
    car2.color = "black";


    //when
    String description = carSeller.describe(car1/*, car2*/);

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
  }

  @Order(3)
  @Test
  public void describeCoupleOfCarsAsList() {
    //given
    Car car1 = new Car();
    //car1.carType = CarType.SEDAN;
    //car1.color = "blue";

    Car car2 = new Car();
    //car2.carType = CarType.COMBI;
    //car2.color = "black";


    //when
    List<Car> objects = List.of(car1, car2);
    String description = carSeller.describe(null); //put it in here

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
  }

  @Order(4)
  @Test
  public void describeACarWithDetails() {
    //given
    Car car = new Car(/*new SteeringWheel("chromed")*/); //add parts,

    //when

    String description = carSeller.describe/*WithDetails*/(car); //put it in here

    //then
    assertThat(description).isEqualTo("Car is a white sedan with black and white tires and ceramic breaks and chromed steering wheel");
  }
}
