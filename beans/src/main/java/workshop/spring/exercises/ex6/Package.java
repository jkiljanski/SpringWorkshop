package workshop.spring.exercises.ex6;

public class Package {
    private final int number;
    private final  boolean isDamaged;

    public Package(int number, boolean isDamaged) {
        this.number = number;
        this.isDamaged = isDamaged;
    }

    public int getNumber() {
        return number;
    }

    public boolean isDamaged() {
        return isDamaged;
    }
}
