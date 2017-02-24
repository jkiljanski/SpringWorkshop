package workshop.spring.exercises.ex1;

public class EvenNumberGiver implements SequentialNumberGiver {
    private int i;
    @Override
    public int nextNumber() {
        i++;
        i++;
        return i;
    }
}
