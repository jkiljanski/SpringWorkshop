package workshop.spring.exercises.ex3_config_bean_qualifier.message;

import org.springframework.stereotype.Component;

@Component("wsMessageProcessor")
public class WSMessageProcessor implements MessageProcessor{
    @Override
    public void processMessage(Message message) {

        message.setProcessedBy("WS Processor");
    }
}
