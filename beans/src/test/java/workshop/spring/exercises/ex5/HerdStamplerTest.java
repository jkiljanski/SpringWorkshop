package workshop.spring.exercises.ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

//TODO: strategy should be chosen based on single animal
@Test
@ContextConfiguration
public class HerdStamplerTest extends AbstractTestNGSpringContextTests {

    @Configuration
    @ComponentScan(basePackages = "workshop.spring.exercises.ex5")
    public static class TestConfig{
    }

    @Autowired(required = false)
    private HerdStampler herdStampler;

    public void shouldStampDifferentKindOfAnimals(){

        Cow bigBull = new Cow("Byku", Sex.MALE, 500);
        Cow bigCow = new Cow("Mucka", Sex.FEMALE, 300);
        Cow smallBull = new Cow("Byczek", Sex.MALE, 80);
        Cow smallCow = new Cow("Muciusia", Sex.FEMALE, 80);

        herdStampler.stamp(bigBull, bigCow, smallBull, smallCow);

        assertThat(bigBull.getStamp()).isEqualTo("Big male with name: Byku");
        assertThat(bigCow.getStamp()).isEqualTo("Big female with name: Mucka");
        assertThat(smallBull.getStamp()).isEqualTo("breeding");
        assertThat(smallCow.getStamp()).isEqualTo("breeding");
    }
}
