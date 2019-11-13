package workshop.spring.exercises.ex5;

public class Cow {
  public final Sex sex;
  public int weight;
  public String stamp;

  public Cow(Sex sex, int weight) {

    this.sex = sex;
    this.weight = weight;
  }

  public String getStamp() {

    return stamp;
  }

   void setStamp(String stamp) {
    this.stamp=stamp;
  }
}
