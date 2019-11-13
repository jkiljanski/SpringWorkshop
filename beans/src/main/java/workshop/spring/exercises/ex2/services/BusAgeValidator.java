package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;


@Service
public class BusAgeValidator implements IBusValidator {
  @Override public void validate(final SafetyReport safetyReport, final Bus bus) {
    if (bus.age > 10) {
      safetyReport.thingsToFix.add(bus);
    }
  }
}
