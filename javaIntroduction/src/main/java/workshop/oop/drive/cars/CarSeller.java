package workshop.oop.drive.cars;

import com.google.common.collect.Lists;

public class CarSeller {


    public String describeMeThisCar(Car car) {
        return describeMeThisCar(car, 1);
    }

    public String describeMeThisCar(Car car, int order) {

        return "Car#"+order+" is a "+car.color.toString()+" "+car.carType.name().toLowerCase();
    }

    public String describeMeThisCar(Car ... cars) {
        return describeMeThisCar(Lists.newArrayList(cars));
    }


    public String describeMeThisCar(Iterable <Car> cars) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        for (Car car:cars) {
            i++;
            sb.append(describeMeThisCar(car, i));
            sb.append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
//"Car#1 is a blue sedan, Car#2 is a black combi"
    }
}
