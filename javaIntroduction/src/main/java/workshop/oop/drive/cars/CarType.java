package workshop.oop.drive.cars;

public enum CarType implements CarElementDescribable{

  SEDAN, COMBI, CONVERTABLE, VAN;

  @Override
  public String describeYourself() {

    return this.name().toLowerCase();
  }
}
