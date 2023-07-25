package workshop.spring.exercises.ex5_dependency;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import workshop.spring.exercises.ex5_dependency.processing.ConstructorProcessor;
import workshop.spring.exercises.ex5_dependency.processing.FieldProcessor;
import workshop.spring.exercises.ex5_dependency.processing.ProcessingMachine;
import workshop.spring.exercises.ex5_dependency.processing.SetterProcessor;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@ContextConfiguration
public class DependencyFunTest {

  private static final String INJECTED_AS_FIELD = "injected as field";
  private static final String INJECTED_IN_CONSTRUCTOR = "injected in constructor";
  private static final String INJECTED_IN_SETTER = "injected in setter";


  @Configuration
  @ComponentScan(basePackages = "workshop.spring.exercises.ex5_dependency")
  public static class TestConfig {

  }


  @Autowired
  private ProcessingMachine processingMachine;


  @Order(1)
  @Test
  public void processElementBySimpleMachine() {

    Element element = new Element();
    processingMachine.processElement(element);

    assertThat(element.getProcessedBy())
        .containsExactlyInAnyOrder(
                FieldProcessor.class.getSimpleName(),
                SetterProcessor.class.getSimpleName(),
                ConstructorProcessor.class.getSimpleName()
        );

    //have you activated controllers?
  }
}
