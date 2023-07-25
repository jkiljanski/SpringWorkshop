package workshop.spring.exercises.ex1_xml;

public class NextNumberGiver implements  NumberGiver{

    int i=1;

    @Override
    public int getAndIncrease() {
        return i++;
    }

    @Override
    public void reset() {
        i=1;
    }
}
