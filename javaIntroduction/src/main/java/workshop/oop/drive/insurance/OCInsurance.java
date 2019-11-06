package workshop.oop.drive.insurance;

public class OCInsurance {
  private final Sex sex;
  private final int initialPrice;

  private DiscountHistory discountHistory = new DiscountHistory();

  public OCInsurance(final Sex sex, int price) {

    this.sex = sex;
    this.initialPrice = price;
  }

  public int calculateFinalPrice() {

    DiscountCalculator discountCalculator = new DiscountCalculator(initialPrice, sex);
    discountHistory.accept(discountCalculator);
    return discountCalculator.getActualPrice();

  }

  DiscountHistory getDiscountHistory() {

    return discountHistory;
  }

}
