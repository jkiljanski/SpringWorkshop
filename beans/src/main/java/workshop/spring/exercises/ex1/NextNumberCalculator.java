package workshop.spring.exercises.ex1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class NextNumberCalculator {

  private int currentNumber;

  private final SequentialNameGiver sequentialNameGiver;


  public NextNumberCalculator(@Qualifier("DUPA") final SequentialNameGiver sequentialNameGiver) {

    this.sequentialNameGiver = sequentialNameGiver;
  }

  int provideNextNumber(){

    final int nextNumber = sequentialNameGiver.provideNextNumber(currentNumber);
    currentNumber = nextNumber;
    return currentNumber;
  }
}
