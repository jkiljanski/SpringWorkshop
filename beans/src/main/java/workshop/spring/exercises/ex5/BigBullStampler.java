package workshop.spring.exercises.ex5;

import org.springframework.stereotype.Component;

@Component
public class BigBullStampler implements SelectingStamper {
    @Override
    public boolean doCowApplies(Cow cow) {
        return cow.getSex() == Sex.MALE && cow.getWeight() > 100;
    }

    @Override
    public void stamp(Cow cow) {
        cow.stamp("meat");
    }
}
