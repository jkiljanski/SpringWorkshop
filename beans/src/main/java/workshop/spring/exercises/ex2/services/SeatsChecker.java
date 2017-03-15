package workshop.spring.exercises.ex2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Seat;
@Component
public class SeatsChecker {

    @Autowired
    private SeatBeltChecker seatBeltChecker;

    public void check(Seat seat, SafetyReport safetyReport)
    {
        checkIfNotTooManyHoles(seat, safetyReport);
        checkSeatBelt(seat, safetyReport);
    }

    private void checkSeatBelt(Seat seat, SafetyReport safetyReport) {
        seatBeltChecker.check(seat.seatBelt,safetyReport);
    }

    private void checkIfNotTooManyHoles(Seat seat, SafetyReport safetyReport) {
        if (seat.howManyHoles>1)
        {
            safetyReport.add(seat);
        }
    }


}
