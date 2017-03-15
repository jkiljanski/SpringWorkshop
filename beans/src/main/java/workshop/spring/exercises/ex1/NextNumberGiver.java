package workshop.spring.exercises.ex1;

public class NextNumberGiver implements SequentialNameGiver {
    int currentNumber;

    @Override
    public int getNexNumber() {
        return ++currentNumber;
    }
}
