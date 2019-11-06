package workshop.oop.drive.insurance;

import static workshop.oop.drive.insurance.Sex.FEMALE;

public class SexDiscount extends RelativeDiscount {
  private final Sex sex;

  public SexDiscount(final Sex sex, final int i) {
    super(i);
    this.sex = sex;
  }

  @Override public void calculateDiscount(DiscountCalculator discountCalculator) {
    if (this.sex == discountCalculator.getSex()) {
      super.calculateDiscount(discountCalculator);
    }
  }
}
