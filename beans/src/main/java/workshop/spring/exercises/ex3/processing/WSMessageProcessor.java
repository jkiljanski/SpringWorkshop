package workshop.spring.exercises.ex3.processing;

import org.springframework.stereotype.Component;

@Component("WS")
public class WSMessageProcessor implements MessageProcessor {

    @Override
    public void processMessage(Message message) {
        message.setProcessedBy("WS processor");
    }
}
