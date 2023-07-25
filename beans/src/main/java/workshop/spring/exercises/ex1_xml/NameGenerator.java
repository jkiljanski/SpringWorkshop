package workshop.spring.exercises.ex1_xml;

public class NameGenerator {

  private NumberGiver numberGiver;
  private String prefix = "customName:";

  public String getNextName() {

    return prefix + numberGiver.getAndIncrease();
  }

  public NumberGiver getNumberGiver() {
    return numberGiver;
  }

  public void setNumberGiver(NumberGiver numberGiver) {
    this.numberGiver = numberGiver;
  }

  public void reset() {
    numberGiver.reset();
  }
}
