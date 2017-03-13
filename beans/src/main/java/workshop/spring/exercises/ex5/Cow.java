package workshop.spring.exercises.ex5;

public class Cow {
    private Sex sex;
    private int weight;
    private String name;
    private String stamp;

    public Cow(String name, Sex sex, int weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    public String getStamp() {
        return stamp;
    }
}
