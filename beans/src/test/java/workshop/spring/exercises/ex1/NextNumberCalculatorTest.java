package workshop.spring.exercises.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class NextNumberCalculatorTest {

  @Autowired
  private NumberSequenceProvider numberSequenceProvider;


  @Configuration
  @ComponentScan(basePackages = "workshop.spring.exercises.ex1")
  public static class TestConfig {
  }

  @Test
  public void generateListOfNumbers(){

    assertThat(numberSequenceProvider.provideSequence(5)).containsExactly(1, 2, 3, 4, 5);
    assertThat(numberSequenceProvider.provideSequence(3)).containsExactly(1, 2, 3);

  }

}
