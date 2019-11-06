package workshop.oop.drive.insurance;

public class DiscountCalculator {
  private final Sex sex;
  private int actualPrice;

  public DiscountCalculator(final int initialPrice, final Sex sex) {


    this.actualPrice = initialPrice;
    this.sex = sex;
  }

  int getActualPrice() {
    return actualPrice;
  }

  Sex getSex() {
    return sex;
  }

  void setActualPrice(final int actualPrice) {

    this.actualPrice = actualPrice;
  }
}
