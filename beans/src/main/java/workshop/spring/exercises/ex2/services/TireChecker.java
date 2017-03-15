package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Tire;

@Component
public class TireChecker {


    public void check(Tire tire, SafetyReport safetyReport)
    {
        if (tire.runnerDepth<5)
        {
            safetyReport.add(tire);
        }
    }

}
