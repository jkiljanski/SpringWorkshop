package workshop.oop.drive.cars;

import io.vavr.collection.List;

import java.util.stream.Collectors;

public class CarSeller {

    public String describe(Car car) {

        return String.format("Car is a %s", car.describeYourself());
    }

    public String describe(Car... cars) {

    /*return IntStream.range(0, cars.length)
            .mapToObj( i -> String.format("Car#%s is a %s", i+1, cars[i].describeYourself()))
            .collect(Collectors.joining(", "));*/

        return List.of(cars)
                .zipWithIndex()
                .map(carWithIndex -> String.format("Car#%s is a %s", carWithIndex._2 + 1, carWithIndex._1.describeYourself()))
                .collect(Collectors.joining(", "));

    }

    public String describe(java.util.List<Car> carList) {
        return describe(carList.toArray(new Car[0]));
    }
}
