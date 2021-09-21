package workshop.spring.exercises.ex4_strategy;

public class Cow {
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

  public enum Sex {
    MALE, FEMALE
  }
}
