package workshop.spring.exercises.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class EvenNumberNameXMLSpringTest {

  @Autowired
  private NameGenerator nameGenerator;

  @Test
  public void generatesThreeNextEvenNumberNames() {

    assertThat(nameGenerator.getNextName()).isEqualTo("customName:2");
    assertThat(nameGenerator.getNextName()).isEqualTo("customName:4");
    assertThat(nameGenerator.getNextName()).isEqualTo("customName:6");

  }

}
