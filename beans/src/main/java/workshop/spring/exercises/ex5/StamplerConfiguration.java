package workshop.spring.exercises.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class StamplerConfiguration {


  @Bean
  @Order(1)
  CowStampler meatStampler() {

    return new CowStampler() {


      @Override public String getStamp() {

        return "Meat";
      }

      @Override public boolean applies(final Cow cow) {

        return cow.sex == Sex.MALE && cow.weight > 400;
      }

    };
  }

  @Bean
  @Order(2)
  CowStampler milkStampler() {

    return new CowStampler() {
      @Override public String getStamp() {

        return "milk";
      }

      @Override public boolean applies(final Cow cow) {

        return cow.sex == Sex.FEMALE && cow.weight > 200;
      }
    };
  }

  @Bean
  CowStampler breadingStampler(){
    return new CowStampler(){
      @Override public String getStamp() {
        return "breeding";
      }

      @Override public boolean applies(final Cow cow) {
        return true;
      }
    };
  }

}
