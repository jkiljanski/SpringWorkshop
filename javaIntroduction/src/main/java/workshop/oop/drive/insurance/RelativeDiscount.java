package workshop.oop.drive.insurance;

public class RelativeDiscount implements Discounts {
  private final int relativeDiscountValue;

  public RelativeDiscount(final int i) {

    this.relativeDiscountValue = i;
  }

  @Override public void calculateDiscount(DiscountCalculator discountCalculator) {

    discountCalculator.setActualPrice(discountCalculator.getActualPrice()
        - discountCalculator.getActualPrice() * relativeDiscountValue / 100);
  }
}
