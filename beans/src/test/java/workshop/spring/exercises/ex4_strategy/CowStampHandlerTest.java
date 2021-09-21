package workshop.spring.exercises.ex4_strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

//TODO: strategy should be chosen based on single animal
@SpringJUnitConfig(CowStamplerConfiguration.class)
public class CowStampHandlerTest {

  @Autowired(required = false)
  private CowStamplerHandler cowStamplerHandler;

  @Test
  public void shouldStampDifferentKindOfAnimals() {

    Cow bigBull = new Cow(Cow.Sex.MALE, 500);
    Cow mediumMilkCow = new Cow(Cow.Sex.FEMALE, 300);
    Cow smallBull = new Cow(Cow.Sex.MALE, 80);
    Cow smallCow = new Cow(Cow.Sex.FEMALE, 80);

    cowStamplerHandler.stamp(bigBull, mediumMilkCow, smallBull, smallCow);

    assertThat(bigBull.getStamp()).isEqualTo("meat");
    assertThat(mediumMilkCow.getStamp()).isEqualTo("milk");
    assertThat(smallBull.getStamp()).isEqualTo("breeding");
    assertThat(smallCow.getStamp()).isEqualTo("breeding");
  }
}
