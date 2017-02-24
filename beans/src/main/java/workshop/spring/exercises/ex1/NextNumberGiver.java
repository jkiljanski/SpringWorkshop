package workshop.spring.exercises.ex1;

public class NextNumberGiver implements SequentialNumberGiver{
    private int i;
    @Override
    public int nextNumber() {
        return ++i;
    }
}
