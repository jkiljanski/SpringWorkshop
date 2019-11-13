package workshop.spring.exercises.ex1;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberSequenceProvider {

  @Autowired
  ObjectFactory<NextNumberCalculator> nextNumberCalculatorFactory;


  public List<Integer> provideSequence(int numberCount){

    final ArrayList<Integer> integers = Lists.newArrayList();

    final NextNumberCalculator calculator = nextNumberCalculatorFactory.getObject();

    for (int i = 0; i < numberCount; i++) {
      integers.add(calculator.provideNextNumber());
    }
    return integers;
  }
}
