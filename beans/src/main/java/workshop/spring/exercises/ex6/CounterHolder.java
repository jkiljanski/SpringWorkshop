package workshop.spring.exercises.ex6;

import org.springframework.stereotype.Component;

@Component
public class CounterHolder {

    private int currentCounter;

    public void setCurrentCounter(int currentCounter) {
        this.currentCounter = currentCounter;
    }

    public int getCurrentCounter() {
        return currentCounter;
    }
}
