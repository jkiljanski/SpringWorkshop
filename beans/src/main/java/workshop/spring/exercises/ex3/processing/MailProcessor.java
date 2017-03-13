package workshop.spring.exercises.ex3.processing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Mail")
@Component
public class MailProcessor extends CommonProcessor {

    public MailProcessor() {
        super("Mail processor");
    }

}
