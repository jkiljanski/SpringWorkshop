package workshop.spring.exercises.ex2.services;

import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex2.domain.Engine;
import workshop.spring.exercises.ex2.domain.SafetyReport;
@Component
public class EngineChecker implements BusElementChecker<Engine>{

    public void check(Engine engine, SafetyReport safetyReport)
    {
        if (engine.condition== Engine.Condition.BAD)
        {
            safetyReport.add(engine);
        }
    }

}
