package workshop.spring.exercises.ex2.services;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Component
public class BusSeatValidator implements IBusValidator{

  @Override public void validate(final SafetyReport safetyReport, final Bus bus) {
    safetyReport.thingsToFix.addAll(
        bus.seats.stream().filter(sit -> !sit.seatBelt.doItWork).map(seat -> seat.seatBelt).collect(
            Collectors.toList()));
    validateHoles(safetyReport, bus);
  }

  private void validateHoles(final SafetyReport safetyReport, final Bus bus) {
    safetyReport.thingsToFix.addAll(bus.seats.stream().filter(sit -> sit.howManyHoles > 1).collect(
        Collectors.toList()));

  }

}
