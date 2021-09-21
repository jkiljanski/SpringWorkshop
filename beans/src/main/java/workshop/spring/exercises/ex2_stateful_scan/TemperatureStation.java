package workshop.spring.exercises.ex2_stateful_scan;

import org.springframework.stereotype.Component;

@Component
public class TemperatureStation {

    public static final int MAX_TEMP = 50;

    public int getCurrentTemp(){
        return (int) (Math.random()* MAX_TEMP);
    }
}
