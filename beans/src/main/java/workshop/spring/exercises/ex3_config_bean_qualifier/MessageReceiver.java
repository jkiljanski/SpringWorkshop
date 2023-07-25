package workshop.spring.exercises.ex3_config_bean_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex3_config_bean_qualifier.message.Message;
import workshop.spring.exercises.ex3_config_bean_qualifier.message.MessageProcessor;

@Component
public class MessageReceiver {

  @Qualifier("jmsMessageProcessor")
  @Autowired
  MessageProcessor jmsMessageProcessor;

  @Qualifier("mailMessageProcessor")
  @Autowired
  MessageProcessor mailMessageProcessor;

  @Qualifier("wsMessageProcessor")
  @Autowired
  MessageProcessor wsMessageProcessor;

  public void receiveFromJMS(Message message) {

    jmsMessageProcessor.processMessage(message);
  }

  public void receiveViaMail(Message message) {
    mailMessageProcessor.processMessage(message);

  }

  public void receiveFromWS(Message message) {
    wsMessageProcessor.processMessage(message);

  }
}
