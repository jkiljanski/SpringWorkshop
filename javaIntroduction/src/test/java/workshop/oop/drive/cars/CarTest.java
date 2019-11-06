package workshop.oop.drive.cars;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class CarTest {

    @Test
    public void carHasBlueColor(){

        Car car = new Car();
        car.color = "blue";
        assertThat(car.color).isEqualTo("Blue");
    }


}
