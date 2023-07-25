package workshop.spring.exercises.ex1_xml;

public class NextOddNumberGiver implements  NumberGiver{

    int i=0;

    @Override
    public int getAndIncrease() {
        return i+=2;
    }

    @Override
    public void reset() {
        i=0;
    }
}
