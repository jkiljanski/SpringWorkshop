package workshop.spring.exercises.ex2.services;

import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;

public interface IBusValidator {
  void validate(SafetyReport safetyReport, Bus bus);
}
