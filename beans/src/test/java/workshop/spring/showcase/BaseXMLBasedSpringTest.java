package workshop.spring.showcase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import workshop.spring.showcase.thirdparty.NotABeanGeneratorWrapper;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-test-config.xml"})
public class BaseXMLBasedSpringTest {

  @Autowired
  NotABeanGeneratorWrapper notABeanGeneratorWrapper;

  @Test()
  void wrapperWrapsEmail() {

    String email = notABeanGeneratorWrapper.generate();
    System.out.println(email);

    assertThat(email)
        .isNotNull()
        .isEqualTo("wrapped with [test description]: feedback@yoursite.com");


  }

}
