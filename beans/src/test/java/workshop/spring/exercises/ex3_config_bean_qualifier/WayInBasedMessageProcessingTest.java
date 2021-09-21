package workshop.spring.exercises.ex3_config_bean_qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import workshop.spring.exercises.ex3_config_bean_qualifier.message.Message;

import static org.assertj.core.api.Assertions.assertThat;

//TODO: Message coming from different sources should be processed differently
@SpringBootTest
@ContextConfiguration
public class WayInBasedMessageProcessingTest {
  @Configuration
  @ComponentScan(basePackages = "workshop.spring.exercises.ex3_config_bean_qualifier")
  public static class TestConfig {
  }


  @Autowired(required = false)
  MessageReceiver messageReceiver;

  @Test
  public void messageSendFromJMS() {

    Message message = new Message();
    messageReceiver.receiveFromJMS(message);
    assertThat(message.getProcessedBy()).isEqualTo("JMS Processor");
  }

  @Test
  public void messageSendViaMail() {

    Message message = new Message();
    messageReceiver.receiveViaMail(message);
    assertThat(message.getProcessedBy()).isEqualTo("Mail processor");
  }

  @Test
  public void messageSendFromWS() {

    Message message = new Message();
    messageReceiver.receiveFromWS(message);
    assertThat(message.getProcessedBy()).isEqualTo("WS processor");
  }
}
