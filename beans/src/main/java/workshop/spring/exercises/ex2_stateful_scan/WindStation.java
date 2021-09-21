package workshop.spring.exercises.ex2_stateful_scan;

import org.springframework.stereotype.Component;

@Component
public class WindStation {

    public static final int MAX_WIND = 200;

    public int getCurrentWind(){
        return (int) (Math.random()* MAX_WIND);
    }


}
