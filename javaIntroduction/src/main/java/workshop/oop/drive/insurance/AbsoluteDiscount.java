package workshop.oop.drive.insurance;

public class AbsoluteDiscount implements Discounts {
  final int absoluteDiscountValue;

  public AbsoluteDiscount(final int i) {
    this.absoluteDiscountValue = i;
  }

  @Override public void calculateDiscount(DiscountCalculator discountCalculator) {

    discountCalculator.setActualPrice(discountCalculator.getActualPrice() - absoluteDiscountValue);
  }

  @Override
  public boolean isAbsoluteDiscount()
  {
    return true;
  }
}
