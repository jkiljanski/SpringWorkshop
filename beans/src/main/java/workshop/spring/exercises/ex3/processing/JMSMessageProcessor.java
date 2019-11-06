package workshop.spring.exercises.ex3.processing;

import org.springframework.stereotype.Component;

@Component("JMS")
public class JMSMessageProcessor implements MessageProcessor {
    @Override
    public void processMessage(Message message) {
        message.setProcessedBy("JMS Processor");
    }
}
