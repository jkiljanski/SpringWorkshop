package workshop.spring.exercises.ex2_stateful_scan;

import java.util.ArrayList;
import java.util.List;

public class WeatherReport {

    List<Integer> temperatures = new ArrayList<>();
    List<Integer> winds = new ArrayList<>();

    private TemperatureStation temperatureStation;

    private WindStation windStation;

    private static final int WINDY_DAY_THRESHOLD = 10;

    public WeatherReport(TemperatureStation temperatureStation, WindStation windStation) {

        this.temperatureStation = temperatureStation;
        this.windStation = windStation;
    }

    public void collectDataForOneDay() {

        temperatures.add(temperatureStation.getCurrentTemp());
        winds.add(windStation.getCurrentWind());
    }

    public int getAverageTemperature() {
        return (int) temperatures.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public int getWindyDays() {
        return (int) winds.stream().filter(t -> t> WINDY_DAY_THRESHOLD).count();

    }
}
