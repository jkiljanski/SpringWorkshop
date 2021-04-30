package workshop.oop.drive.insurance;

public class OCInsurance {
  private final int price;
  private int absoluteDiscount;
  private int relativeDiscount;

  public OCInsurance(int price) {
    this.price = price;
  }

  public int calculateFinalPrice() {
    return (price-absoluteDiscount)*(100-relativeDiscount)/100;
  }

  public void addAbsoluteDiscount(int amount) {
    absoluteDiscount += amount;
  }

  public void addRelativeDiscount(int percent) {
    relativeDiscount = percent;

  }

  public void removeAbsoluteDiscounts() {
    absoluteDiscount = 0;
  }
}
