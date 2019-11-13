package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Bus;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Component
public class BusValidator {
  private final BusSeatValidator busSeatValidator;
  private final BusTiresValidator busTiresValidator;
  private final BusEngineValidator busEngineValidator;
  private final BusAgeValidator busAgeValidator;

  public BusValidator(
      final BusSeatValidator busSeatValidator,
      final BusTiresValidator busTiresValidator,
      final BusEngineValidator busEngineValidator,
      final BusAgeValidator busAgeValidator) {

    this.busSeatValidator = busSeatValidator;
    this.busTiresValidator = busTiresValidator;
    this.busEngineValidator = busEngineValidator;
    this.busAgeValidator = busAgeValidator;
  }

  SafetyReport prepareReport(final Bus bus) {
    SafetyReport safetyReport = new SafetyReport();
    prepareSaftyReport(bus, safetyReport);
    return safetyReport;
  }

  private void prepareSaftyReport(final Bus bus, final SafetyReport safetyReport) {
    validateBus(bus, safetyReport);
  }

  private void validateBus(final Bus bus, final SafetyReport safetyReport) {
    busAgeValidator.validate(safetyReport, bus);
    busEngineValidator.validate(safetyReport, bus);
    busTiresValidator.validate(safetyReport, bus);
    busSeatValidator.validate(safetyReport, bus);
  }
}
