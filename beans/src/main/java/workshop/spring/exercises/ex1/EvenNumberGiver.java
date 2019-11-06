package workshop.spring.exercises.ex1;

public class EvenNumberGiver implements SequentialNameGiver {
    int currentNumber;
    @Override
    public int getNexNumber() {
        return currentNumber +=2;
    }
}
