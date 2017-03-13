package workshop.spring.exercises.ex3.processing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("JMS")
@Component
public class JMSProcessor extends CommonProcessor {
    public JMSProcessor() {
        super("JMS Processor");
    }

}
