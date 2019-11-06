package workshop.spring.exercises.ex5;

import org.springframework.stereotype.Component;

@Component
public class SmallCowStampler implements SelectingStamper {
    @Override
    public boolean doCowApplies(Cow cow) {
        return cow.getWeight() < 100;
    }

    @Override
    public void stamp(Cow cow) {
        cow.stamp("breeding");
    }
}
