package workshop.spring.exercises.ex1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("DUPA")
public class NextNumberGiver implements SequentialNameGiver {
  @Override public int provideNextNumber(final int i) {

    return i+1;
  }
}
