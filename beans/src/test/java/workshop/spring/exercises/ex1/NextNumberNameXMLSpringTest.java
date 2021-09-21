package workshop.spring.exercises.ex1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(SpringExtension.class)
public class NextNumberNameXMLSpringTest {

    @Autowired
    private NameGenerator nameGenerator;


    @Order(1)
    @Test
    public void generateSingleName() {

        assertThat(nameGenerator.getNextName()).isEqualTo("customName:1");

    }


    @Order(2)
    @Test
    public void generateTwoMoreNames() {

        assertThat(nameGenerator.getNextName()).isEqualTo("customName:1");
        assertThat(nameGenerator.getNextName()).isEqualTo("customName:2");

    }
}
