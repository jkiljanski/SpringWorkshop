package workshop.spring.exercises.ex2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Tire;

@Component
public class BusChecker {
    @Autowired
    TireChecker tireCheck;

    public SafetyReport check(Bus bus){

        SafetyReport safetyReport = new SafetyReport();
        if (bus.age>10) {
            safetyReport.addThingToFix(bus);
        }
        for (Tire tire : bus.tires){
            tireCheck.check(tire,safetyReport);
        }
        return safetyReport;
    }
}
