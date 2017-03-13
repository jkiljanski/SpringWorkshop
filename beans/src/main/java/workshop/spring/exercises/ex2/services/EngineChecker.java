package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex2.domain.Engine;
import workshop.spring.exercises.ex2.domain.SafetyReport;

/**
 * This checks engine.
 *
 * @deprecated This is failing. Stop using it.
 */
@Service
@Deprecated
public class EngineChecker implements BusPartChecker<Engine>{
    public void check(Engine engine, SafetyReport safetyReport)
    {
        if (Engine.Condition.BAD.equals(engine.condition)){
            safetyReport.addThingToFix(engine);
        }
    }
}
