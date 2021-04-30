package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class CarTest {

  @Test
  public void carHasBlueColor() {

    //given
    Car car = new Car(CarType.COMBI, CarColor.BLUE);

    //when
    String color = car.describeMeYourColor();

    //then
    assertThat(color).as("Car should have selected color!").isEqualTo("blue");
  }


}
