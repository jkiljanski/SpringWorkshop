package workshop.oop.drive.insurance;

import java.util.ArrayList;
import java.util.List;

public class OCInsurance {

  private final int price;
  private final Sex sex;

  List<Discount> discountList = new ArrayList<>();


  public OCInsurance(int price) {
    this (Sex.FEMALE, price);
  }

  public OCInsurance(Sex sex, int price){
    this.sex = sex;
    this.price = price;
  }


  public int calculateFinalPrice() {
    int temp = price;
    for (Discount discount : discountList) {
      temp = discount.recalculatePrice(temp, sex);
    }
    return temp;
  }

  public void addAbsoluteDiscount(int discount) {
    discountList.add(new AbsoluteDiscount(discount));
  }

  public void addRelativeDiscount(int relativeDiscount) {
    discountList.add(new RelativeDiscount(relativeDiscount));
  }

  public void removeAbsoluteDiscounts() {
    discountList.removeIf(e -> e.getClass() == AbsoluteDiscount.class);
  }

  public void addVIPRelativeDiscount(int vipRelativeDiscount) {
    discountList.add(new ConditionalDiscount(
            (price, sex) -> price > 6000,
            new RelativeDiscount(vipRelativeDiscount))
    );
  }

  public void addSexDiscount(Sex sex, int discount) {
    discountList.add(new ConditionalDiscount(
            (price, insuranceSex) -> insuranceSex == sex,
            new RelativeDiscount(discount))
    );
  }
}
