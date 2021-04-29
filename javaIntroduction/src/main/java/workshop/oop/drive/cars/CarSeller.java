package workshop.oop.drive.cars;


import io.vavr.collection.Stream;

import java.util.stream.Collectors;

public class CarSeller {

    public String describe(Car car) {
        return "Car is a " + car.describeColor() + " " + car.describeType();
    }

    public String describe(Car... cars) {
        return Stream.of(cars)
                .zipWithIndex()
                .map(carIntegerTuple2 -> {
                    Car car = carIntegerTuple2._1;
                    Integer position = carIntegerTuple2._2 + 1;

                    return "Car#" + position + " is a " + car.describeColor() + " " + car.describeType();
                })
                .collect(Collectors.joining(", "));

    }
}
