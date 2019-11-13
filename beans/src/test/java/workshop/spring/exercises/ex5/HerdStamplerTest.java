package workshop.spring.exercises.ex5;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

//TODO: strategy should be chosen based on single animal
@SpringBootTest
@ContextConfiguration
public class HerdStamplerTest {

  @Configuration
  @ComponentScan(basePackages = "workshop.spring.exercises.ex5")
  public static class TestConfig {
  }


  @Autowired(required = false)
  private HerdStampler herdStampler;

  @Test
  public void shouldStampDifferentKindOfAnimals() {

    Cow bigBull = new Cow(Sex.MALE, 500);
    Cow mediumMilkCow = new Cow(Sex.FEMALE, 300);
    Cow smallBull = new Cow(Sex.MALE, 80);
    Cow smallCow = new Cow(Sex.FEMALE, 80);

    herdStampler.stamp(bigBull, mediumMilkCow, smallBull, smallCow);

    assertThat(bigBull.getStamp()).isEqualToIgnoringCase("meat");
    assertThat(mediumMilkCow.getStamp()).isEqualToIgnoringCase("milk");
    assertThat(smallBull.getStamp()).isEqualToIgnoringCase("breeding");
    assertThat(smallCow.getStamp()).isEqualToIgnoringCase("breeding");
  }
}
