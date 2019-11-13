package workshop.spring.exercises.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@TestMethodOrder(OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "SequentialNameXMLSpringTest-context-krowa.xml")
public class SequentialNameXMLSpringTest {

  @Autowired
  private NameGenerator nameGenerator;


  @Test
  @Order(1)
  public void generateSingleName() {


    assertThat(nameGenerator.getNextName()).isEqualTo("customName:1");

  }


  //TODO: try to run only one
  //TODO: change order of a test
  //TODO: use dependsOnMethod
  @Test
  @Order(2)
  public void generateTwoMoreNames() {

    assertThat(nameGenerator.getNextName()).isEqualTo("customName:2");
    assertThat(nameGenerator.getNextName()).isEqualTo("customName:3");

  }



}
