package workshop.spring.exercises.ex2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Component
public class BusChecker {

  @Autowired
  private BusValidator busValidator;

  public SafetyReport check(Bus bus) {

    return busValidator.prepareReport(bus);
  }
}
