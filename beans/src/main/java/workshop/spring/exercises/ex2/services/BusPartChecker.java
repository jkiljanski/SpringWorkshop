package workshop.spring.exercises.ex2.services;

import workshop.spring.exercises.ex2.domain.SafetyReport;

public interface BusPartChecker <T>{
    void check(T o, SafetyReport safetyReport);
}
