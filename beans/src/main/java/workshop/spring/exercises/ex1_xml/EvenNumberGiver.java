package workshop.spring.exercises.ex1_xml;

public class EvenNumberGiver implements  NumberGiver{

    int i=2;

    @Override
    public int getAndIncrease() {
        int result = i;
        i +=2;
        return result;
    }
}
