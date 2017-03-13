package workshop.spring.exercises.ex2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.Seat;
import workshop.spring.exercises.ex2.domain.SeatBelt;

@Service
public class SeatChecker extends LoggingBusPartChecker <Seat> implements BusPartChecker<Seat>{

    @Autowired
    BusPartChecker<SeatBelt> seatBeltChecker;

    public void innerCheck(Seat seat, SafetyReport safetyReport) {
        if (seat.howManyHoles>0){
            safetyReport.addThingToFix(seat);
        }
        SeatBelt seatBelt = seat.seatBelt;
        seatBeltChecker.check(seatBelt, safetyReport);
    }

}
