package workshop.spring.exercises.ex1;

public class NextNumberGiver implements  NumberGiver{

    int i=1;

    @Override
    public int getAndIncrease() {
        return i++;
    }
}
