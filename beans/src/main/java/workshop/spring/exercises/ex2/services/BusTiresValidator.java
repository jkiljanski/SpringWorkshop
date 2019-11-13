package workshop.spring.exercises.ex2.services;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Component
public class BusTiresValidator implements  IBusValidator{

  @Override public void validate(final SafetyReport safetyReport, final Bus bus) {

    safetyReport.thingsToFix.addAll(bus.tires.stream().filter(tire -> tire.runnerDepth < 5).collect(
        Collectors.toList()));
  }
}
