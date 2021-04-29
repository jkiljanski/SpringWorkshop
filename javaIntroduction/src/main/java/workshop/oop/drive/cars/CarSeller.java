package workshop.oop.drive.cars;


import io.vavr.collection.Stream;

import java.util.stream.Collectors;

public class CarSeller {

    public String describe(Car car) {
        String carWithOptionalPosition = "Car";
        return createDescription(carWithOptionalPosition, car);
    }

    private String createDescription(String carWithOptionalPosition, Car car) {
        return carWithOptionalPosition + " is a " + car.describeColor() + " " + car.describeType();
    }

    public String describe(Car... cars) {
        return Stream.of(cars)
                .zipWithIndex()
                .map(carWithIndex -> {
                    Car car = carWithIndex._1;
                    Integer position = carWithIndex._2 + 1;

                    return createDescription("Car#" + position, car);
                })
                .collect(Collectors.joining(", "));

    }
}
