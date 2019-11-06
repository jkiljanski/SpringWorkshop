package workshop.spring.exercises.ex1;

public class NameGenerator {

    private SequentialNameGiver counter;

    private String prefix = "customName:";
    public String getNextName() {
        return prefix + counter.getNexNumber();
    }


    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setCounter(SequentialNameGiver counter) {
        this.counter = counter;
    }
}
