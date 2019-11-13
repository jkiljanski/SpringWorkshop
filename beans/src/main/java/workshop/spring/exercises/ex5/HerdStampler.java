package workshop.spring.exercises.ex5;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HerdStampler {
  private final List<CowStampler> cowStamplerList;

  HerdStampler(final List<CowStampler> cowStamplerList) {

    this.cowStamplerList = cowStamplerList;
  }



  public void stamp(Cow... cows) {

    for (final Cow cow : cows) {
      stamSingleCow(cow);
    }
  }

  private void stamSingleCow(final Cow cow) {

    for (CowStampler cowStampler : cowStamplerList){
      if (cowStampler.stamp(cow)) {

        return;
      }
    }
  }
}
