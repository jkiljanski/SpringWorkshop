package workshop.spring.exercises.ex1;

public class NextNumberGiver implements SequentialNumberGiver{
    private int i=0;

    @Override
    public int nextNumber() {
        return ++i;
    }
}
