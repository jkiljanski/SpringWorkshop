package workshop.spring.exercises.ex2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Seat;
import workshop.spring.exercises.ex2.domain.Tire;

@Component
public class BusChecker {

    @Autowired
    private TireChecker tireChecker;
    @Autowired
    private EngineChecker engineChecker;
    @Autowired
    private SeatsChecker seatChecker;


    public SafetyReport check(Bus bus) {

        SafetyReport safetyReport = new SafetyReport();
        checkIfAgeIsBelow5(bus, safetyReport);
        checkTires(bus, safetyReport);
        checkEngine(bus, safetyReport);
        checkSeats(bus, safetyReport);

        return safetyReport;
    }

    private void checkSeats(Bus bus, SafetyReport safetyReport) {
        for (Seat seat : bus.seats)
        {
            seatChecker.check(seat,safetyReport);
        }
    }

    private void checkEngine(Bus bus, SafetyReport safetyReport) {
        engineChecker.check(bus.engine, safetyReport);
    }

    private void checkTires(Bus bus, SafetyReport safetyReport) {
        for (Tire tire : bus.tires) {
            tireChecker.check(tire, safetyReport);
        }
    }

    private void checkIfAgeIsBelow5(Bus bus, SafetyReport safetyReport) {
        if (bus.age > 5) {
            safetyReport.add(bus);
        }
    }
}
