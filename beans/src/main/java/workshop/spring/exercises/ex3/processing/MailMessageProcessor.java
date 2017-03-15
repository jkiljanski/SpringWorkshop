package workshop.spring.exercises.ex3.processing;

import org.springframework.stereotype.Component;

@Component("Mail")
public class MailMessageProcessor implements MessageProcessor {
    @Override
    public void processMessage(Message message) {
        message.setProcessedBy("Mail processor");
    }
}
