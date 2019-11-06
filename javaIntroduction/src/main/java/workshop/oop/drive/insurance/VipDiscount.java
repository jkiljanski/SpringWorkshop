package workshop.oop.drive.insurance;

public class VipDiscount extends RelativeDiscount {

  public VipDiscount(final int percentage) {
    super(percentage);
  }

  @Override public void calculateDiscount(DiscountCalculator discountCalculator) {

    if (discountCalculator.getActualPrice() > 1000) {
      super.calculateDiscount(discountCalculator);
    }
  }
}
