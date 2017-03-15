package workshop.spring.exercises.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HerdStampler {

    @Autowired
    private List<SelectingStamper> selectingStamplers;

    public void stamp(Cow... cows) {
        for (Cow cow : cows) {
            stampSingle(cow);
        }
    }

    private void stampSingle(Cow cow) {
        for (SelectingStamper selectingStampler : selectingStamplers) {
            if (selectingStampler.doCowApplies(cow)) {
                selectingStampler.stamp(cow);
                return;
            }
        }


    }
}
