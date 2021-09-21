package workshop.spring.exercises.ex2_stateful_scan;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class WeatherReportTest {

    WeatherReportGeneratingService weatherReportGeneratingService;
    TemperatureStation temperatureStation;
    WindStation windStation;

    @Configuration
    @ComponentScan(basePackages = "workshop.spring.exercises.ex2_stateful_scan")
    public static class TestConfig {
    }

    @BeforeEach
    public void setUpStations(){
        given(temperatureStation.getCurrentTemp()).willReturn(10, 12, 17, 25, 26);
        given(windStation.getCurrentWind()).willReturn(0, 2, 35, 25, 3);
    }

    @Order(1)
    @Test
    public void generateReportFor3Days() {

        WeatherReport weatherReport = weatherReportGeneratingService.startReport();
        weatherReport.collectDataForOneDay();
        weatherReport.collectDataForOneDay();
        weatherReport.collectDataForOneDay();
        assertThat(weatherReport.getAverageTemperature()).isEqualTo(13);
        assertThat(weatherReport.getWindyDays()).isEqualTo(1);
    }


    @Order(2)
    @Test
    public void generateReportFor4Days() {

        WeatherReport weatherReport = weatherReportGeneratingService.startReport();
        weatherReport.collectDataForOneDay();
        weatherReport.collectDataForOneDay();
        weatherReport.collectDataForOneDay();
        weatherReport.collectDataForOneDay();
        assertThat(weatherReport.getAverageTemperature()).isEqualTo(16);
        assertThat(weatherReport.getWindyDays()).isEqualTo(2);
    }



}
