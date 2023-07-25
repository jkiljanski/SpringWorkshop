package workshop.spring.exercises.ex2_stateful_scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherReportGeneratingService {

    @Autowired
    private TemperatureStation temperatureStation;

    @Autowired
    private WindStation windStation;


    public WeatherReport startReport() {
        return new WeatherReport(temperatureStation, windStation);
    }
}
