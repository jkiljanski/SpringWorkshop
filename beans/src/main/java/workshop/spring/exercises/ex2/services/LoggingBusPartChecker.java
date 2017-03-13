package workshop.spring.exercises.ex2.services;

import workshop.spring.exercises.ex2.domain.SafetyReport;

public abstract class LoggingBusPartChecker<T> implements BusPartChecker<T> {
    @Override
    public void check(T o, SafetyReport safetyReport) {
        System.out.println("Currently checking " + o);

        innerCheck(o, safetyReport);
    }

    protected abstract void innerCheck(T o, SafetyReport safetyReport);
}
