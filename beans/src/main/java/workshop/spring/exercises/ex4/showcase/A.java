package workshop.spring.exercises.ex4.showcase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private final B1 b1;

    private final B2 b2;

    private final B3 b3;

    @Autowired
    public A(B1 b1, B2 b2, B3 b3) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }
}
