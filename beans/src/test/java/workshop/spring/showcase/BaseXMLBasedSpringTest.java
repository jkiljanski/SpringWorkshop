package workshop.spring.showcase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;



import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class BaseXMLBasedSpringTest  {

  @Autowired
  BeanInitializedInXML beanInitializedInXML;

  @Test()
  void wrapperWrapsEmail() {

    String email = beanInitializedInXML.generate();
    System.out.println(email);

    assertThat(email)
        .isNotNull()
        .isEqualTo("wrapped with [test description]: feedback@yoursite.com");


  }

}
