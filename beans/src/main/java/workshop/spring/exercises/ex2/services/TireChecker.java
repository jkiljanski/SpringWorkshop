package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Tire;

@Service
public class TireChecker {

    void check(Tire tire, SafetyReport report){
        if (tire.runnerDepth<5) {
            report.addThingToFix(tire);
        }
    }
}
