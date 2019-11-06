package workshop.spring.exercises.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex3.processing.Message;
import workshop.spring.exercises.ex3.processing.MessageProcessor;

@Component
public class MessageReceiver {

    @Autowired
    @Qualifier("JMS")
    MessageProcessor processorForJMS;

    @Autowired
    @Qualifier("WS")
    MessageProcessor processorForWS;

    @Autowired
    @Qualifier("Mail")
    MessageProcessor processorForMail;


    public void receiveFromJMS(Message message) {
        processorForJMS.processMessage(message);
    }

    public void receiveFromWS(Message message) {
        processorForWS.processMessage(message);
    }

    public void receiveViaMail(Message message) {
        processorForMail.processMessage(message);
    }
}
