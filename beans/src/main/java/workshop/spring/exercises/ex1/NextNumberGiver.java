package workshop.spring.exercises.ex1;

public class NextNumberGiver implements SequentialNumberGiver{
    private int i=0;
    private final int multiplier;

    public NextNumberGiver(int multiplier) {
        this.multiplier = multiplier;
    }


    @Override
    public int nextNumber() {
        i+=multiplier;
        return i;
    }
}
