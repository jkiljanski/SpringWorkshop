package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.*;

/**
 * 1_1 describes his blue car
 * 1_2 describes his white car
 * 2_1 takes a white car for a ride and it gets dirty after first ride
 * 3_1 takes a dark car for a ride and it doesn't get dirty after first ride
 * 3_2 takes a dark car for a ride and it gets dirty after 2 rides
 * 4_1 takes a grey car for a ride and it doesn't get dirty after 100 rides
 * 4_2 takes a grey car for a ride and it gets slightly dirty after 101 rides
 * 6_1 puts a ceramic coat on a white car, takes it for a ride and it doesn't get dirty after 5 rides.
 * 7_1 extra - more than one car?
 */

@DisplayName("Car owner describing his car")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarOwnerTest {

  CarOwner carOwner = new CarOwner();

  @Order(1_1)
  @DisplayName("describes his blue car")
  @Test
  public void describesBlueCar(){
    //given
    Car car = new Car();
    car.carType = CarType.COMBI;
    car.color = "blue";

    //when
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a blue combi");
  }

  @Order(1_2)
  @DisplayName("describes his white car")
  @Test
  public void describesWhiteCar(){
    //given
    Car car = new Car();

    //when
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a ???");
  }

  @Order(2_1)
  @DisplayName("takes a white car for a ride and it gets dirty after first ride")
  @Test
  public void describeWhiteCarAfterOneRide(){
    //given

    //when
    carOwner.takeARide();
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a dirty white sedan");
  }

  @Order(3_1)
  @DisplayName("takes a dark car for a ride and it doesn't get dirty after first ride")
  @Test
  public void describeDarkCarAfterOneRide(){
    //given

    //then
    carOwner.takeARide();
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a dark sedan");
  }


  @Order(3_2)
  @DisplayName("takes a dark car for a ride and it gets dirty after 2 rides")
  @Test
  public void describeDarkCarAfterTwoRides(){
    //given
    //when
    carOwner.takeARide();
    carOwner.takeARide();
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a dirty dark sedan");
  }

  @Order(4_1)
  @DisplayName("takes a grey car for a ride and it doesn't get dirty after 100 rides")
  @Test
  public void describeGreyCarAfter100Rides(){
    //given
    //when
    IntStream.of(100).forEach(i -> carOwner.takeARide());
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a grey sedan");
  }

  @Order(4_2)
  @DisplayName("takes a grey car for a ride and it gets slightly dirty after 101 rides")
  @Test
  public void describeGreyCarAfter101Rides(){
    //given
    //when
    IntStream.of(101).forEach(i -> carOwner.takeARide());
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a slightly dirty grey sedan");
  }

  @Order(6_1)
  @DisplayName("puts a ceramic coat on a white car, takes it for a 5 rides and it doesn't get dirty.")
  @Test
  public void ceramicCoatsProtectsColor(){
    //given
    //owner.putCeramicCoat()
    //when
    IntStream.of(5).forEach(i -> carOwner.takeARide());
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car is a white sedan");
  }


  @Order(7_1)
  @DisplayName("extra - more than one car?")
  @Test
  public void hasTwoCars(){
    //given
    //when
    String description = carOwner.describeYourCar();

    //then
    assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
  }
}
