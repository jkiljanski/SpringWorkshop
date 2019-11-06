package workshop.oop.drive.insurance;

import java.util.LinkedList;

public class DiscountHistory {

  private LinkedList<Discounts> discounts = new LinkedList<>();

  public void addAbsoluteDiscount(int i) {

    discounts.add(new AbsoluteDiscount(i));
  }

  public void addRelativeDiscount(int i) {

    discounts.add(new RelativeDiscount(i));
  }

  public void removeAbsoluteDiscounts() {

    discounts.removeIf(Discounts::isAbsoluteDiscount);
  }

  void addVIPDiscount(final int i) {

    discounts.add(new VipDiscount(i));
  }

  void addSexDiscount(final Sex sex, final int i) {

    discounts.add(new SexDiscount(sex, i));
  }

  public void accept(DiscountCalculator discountCalculator){

    for (Discounts discount : discounts) {
      discount.calculateDiscount(discountCalculator);
    }
  }
}
