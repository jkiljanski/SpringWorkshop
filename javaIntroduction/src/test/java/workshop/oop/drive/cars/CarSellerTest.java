package workshop.oop.drive.cars;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class CarSellerTest {

    CarSeller carSeller = new CarSeller();

    @Test
    public void describesSingleCar(){
        //given
        Car car = new Car();
        car.carType = CarType.SEDAN;
        car.color = "blue";

        //when
        String description = carSeller.describeMeThisCar(car);

        //then
        assertThat(description).isEqualTo("Car#1 is a blue sedan");
    }

    @Test
    public void describeCoupleOfCars(){
        //given
        Car car1 = new Car();
        car1.carType = CarType.SEDAN;
        car1.color = "blue";

        Car car2 = new Car();
        car2.carType = CarType.COMBI;
        car2.color = "black";


        //when
        String description = carSeller.describeMeThisCar(car1/*, car2*/);

        //then
        assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
    }

    @Test
    public void describeCoupleOfCarsAsList(){
        //given
        Car car1 = new Car();
        car1.carType = CarType.SEDAN;
        car1.color = "blue";

        Car car2 = new Car();
        car2.carType = CarType.COMBI;
        car2.color = "black";


        //when
        ArrayList<Car> objects = Lists.newArrayList(car1, car2);
        String description = carSeller.describeMeThisCar(null);

        //then
        assertThat(description).isEqualTo("Car#1 is a blue sedan, Car#2 is a black combi");
    }
}
