package workshop.spring.exercises.ex5;

public class Cow {
    public Sex getSex() {
        return sex;
    }

    public int getWeight() {
        return weight;
    }

    private Sex sex;
    private int weight;
    private String stamp;

    public Cow(Sex sex, int weight) {
        this.sex = sex;
        this.weight = weight;
    }

    public String getStamp() {
        return stamp;
    }

    public void stamp(String stamp) {
        this.stamp = stamp;
    }
}
