package workshop.spring.showcase;

import static org.assertj.core.api.Assertions.assertThat;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class BaseSpringTest {

  @Configuration
  @ComponentScan(basePackages = "workshop.spring.showcase")
  public static class TestConfig {
    //@Bean
    public EmailGenerator emailGenerator(){

      return new EmailGenerator();
    }
  }


  @Autowired
  EmailGenerator emailGenerator;

  @Autowired
  ObjectFactory<PrototypeBean> prototypeBeanFactory;

  @Autowired
  PrototypeBean prototypeBean;

  @Test
  void testEmailGenerator() {

    String email = emailGenerator.generate();
    System.out.println(email);

    assertThat(email).isNotNull().isEqualTo("feedback@yoursite.com");


  }

  @Test
  void injectingPrototype(){

    assertThat(prototypeBeanFactory.getObject()).isNotSameAs(prototypeBeanFactory.getObject());
    assertThat(prototypeBean).isNotEqualTo(prototypeBean);
  }

}
