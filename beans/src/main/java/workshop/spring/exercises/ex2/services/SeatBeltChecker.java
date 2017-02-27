package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.SeatBelt;

@Service
public class SeatBeltChecker implements BusPartChecker<SeatBelt> {

    public void check(SeatBelt seatBelt, SafetyReport safetyReport) {
        if (seatBelt.doItWork==false)
        {
            safetyReport.addThingToFix(seatBelt);
        }
    }
}
