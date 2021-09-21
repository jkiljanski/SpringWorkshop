package workshop.spring.showcase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class BaseSpringTest {

  @Configuration
  @ComponentScan(basePackages = "workshop.spring.showcase")
  public static class TestConfig {
  }


  @Autowired
  EmailGenerator emailGenerator;

  @Test
  void testEmailGenerator() {

    String email = emailGenerator.generate();
    System.out.println(email);

    assertThat(email).isNotNull().isEqualTo("feedback@yoursite.com");


  }

}
