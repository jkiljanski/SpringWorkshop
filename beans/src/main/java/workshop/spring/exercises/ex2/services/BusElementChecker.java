package workshop.spring.exercises.ex2.services;

import workshop.spring.exercises.ex2.domain.SafetyReport;

public interface BusElementChecker<T> {

    void check(T element, SafetyReport safetyReport);
}
