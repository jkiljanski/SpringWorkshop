package workshop.spring.exercises.ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import workshop.spring.exercises.ex3.processing.Message;
import workshop.spring.exercises.ex3.processing.MessageProcessor;

@Service
public class MessageReceiver {


    @Autowired
    @Qualifier("JMS")
    MessageProcessor jmsProcessor;

    @Autowired
    @Qualifier("WS")
    MessageProcessor wsProcessor;

    @Autowired
    @Qualifier("Mail")
    MessageProcessor mailProcessor;


    public void receiveFromJMS(Message message) {
        jmsProcessor.processMessage(message);
    }


    public void receiveFromWS(Message message) {
        wsProcessor.processMessage(message);
    }

    public void receiveViaMail(Message message){
        mailProcessor.processMessage(message);
    }
}
