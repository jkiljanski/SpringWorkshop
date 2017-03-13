package workshop.spring.exercises.ex1;

public class EvenNumberGiver implements SequentialNumberGiver{
    private final NextNumberGiver nextNumberGiver;

    public EvenNumberGiver(NextNumberGiver nextNumberGiver) {
        this.nextNumberGiver = nextNumberGiver;
    }

    @Override
    public int nextNumber() {
        nextNumberGiver.nextNumber();
        return nextNumberGiver.nextNumber();
    }
}
