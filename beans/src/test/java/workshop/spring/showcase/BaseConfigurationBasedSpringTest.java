package workshop.spring.showcase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import workshop.spring.showcase.thirdparty.NotABeanGeneratorWrapper;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class BaseConfigurationBasedSpringTest {

    /*@Configuration
    private static class TestConfig {


        @Bean
        NotABeanGeneratorWrapper otherBean(EmailGenerator emailGenerator){
            return new NotABeanGeneratorWrapper(emailGenerator).withDescription("krowa");
        }

        @Bean
        EmailGenerator emailGenerator(){
            return new EmailGenerator();
        }
    }*/

    @Autowired
    NotABeanGeneratorWrapper notABeanGeneratorWrapper;

    @Test
    void wrapperWrapsEmail() {

        String email = notABeanGeneratorWrapper.generate();
        System.out.println(email);

        assertThat(email)
                .isNotNull()
                .isEqualTo("wrapped with [krowa]: feedback@yoursite.com");


    }
}
