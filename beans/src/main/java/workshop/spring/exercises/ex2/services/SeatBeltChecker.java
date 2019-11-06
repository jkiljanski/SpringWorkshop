package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Controller;
import workshop.spring.exercises.ex2.domain.SafetyReport;
import workshop.spring.exercises.ex2.domain.SeatBelt;

@Controller
public class SeatBeltChecker implements BusElementChecker<SeatBelt>{

    @Override
    public  void check (SeatBelt seatBelt , SafetyReport safetyReport)
    {
        if (seatBelt.doItWork==false)
        {
            safetyReport.add(seatBelt);
        }
    }
}
