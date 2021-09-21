package workshop.spring.exercises.ex4_strategy;

import java.util.Arrays;

public class CowStamplerHandler {
  public void stamp(Cow... cows) {

    Arrays.stream(cows).forEach(this::stampSingleCow);

  }

  private void stampSingleCow(Cow cow) {

  }
}
