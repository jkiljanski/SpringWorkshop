package workshop.spring.exercises.ex1_xml;

public class NameGenerator {

  private NumberGiver numberGiver;
  private String prefix = "customName:";

  public NameGenerator(NumberGiver numberGiver) {
    this.numberGiver = numberGiver;
  }

  public String getNextName() {

    return prefix + numberGiver.getAndIncrease();
  }

}
