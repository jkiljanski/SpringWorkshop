package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.Engine.Condition;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Component
public class BusEngineValidator implements IBusValidator {

  @Override public void validate(final SafetyReport safetyReport, final Bus bus) {
    if (bus.engine.condition == Condition.BAD) {
      safetyReport.thingsToFix.add(bus.engine);
    }

  }
}
