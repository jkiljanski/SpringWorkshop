package workshop.spring.exercises.ex3_config_bean_qualifier.message;

import org.springframework.stereotype.Component;

@Component("jmsMessageProcessor")
public class JMSMessageProcessor implements MessageProcessor{
    @Override
    public void processMessage(Message message) {

        message.setProcessedBy("JMS Processor");
    }
}
