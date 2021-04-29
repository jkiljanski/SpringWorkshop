package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import workshop.oop.drive.CarColour;

@DisplayName("Some tests for a car")
public class CarTest {

  @DisplayName("Car color name is normalized")
  @Test
  public void carHasBlueColor() {

    Car car = new Car(CarColour.BLUE);
    assertThat(car.describeColor()).as("This string is not blue!").isEqualTo("blue");
  }


}
