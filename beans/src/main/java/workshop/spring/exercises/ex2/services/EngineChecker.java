package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.Engine;
import workshop.spring.exercises.ex2.domain.SafetyReport;

@Service
public class EngineChecker implements BusPartChecker<Engine>{
    public void check(Engine engine, SafetyReport safetyReport)
    {
        if (Engine.Condition.BAD.equals(engine.condition)){
            safetyReport.addThingToFix(engine);
        }
    }
}
