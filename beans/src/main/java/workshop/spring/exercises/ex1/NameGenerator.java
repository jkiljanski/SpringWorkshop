package workshop.spring.exercises.ex1;

public class NameGenerator {

    private SequentialNumberGiver counter;
    private String prefix = "customName:";
    private int i = 1;

    public String getNextName() {
        return prefix + counter.nextNumber();
    }

    public void setCounter(SequentialNumberGiver counter) {
        this.counter = counter;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
