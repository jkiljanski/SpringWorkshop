package workshop.spring.exercises.ex3.processing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("WS")
@Component
public class WSProcessor extends CommonProcessor {
    public WSProcessor() {
        super("WS processor");
    }


}
