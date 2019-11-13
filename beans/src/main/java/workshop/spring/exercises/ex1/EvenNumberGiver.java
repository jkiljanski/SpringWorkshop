package workshop.spring.exercises.ex1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class EvenNumberGiver implements SequentialNameGiver {

  @Override public int provideNextNumber(final int i) {

    return i+2;
  }
}
