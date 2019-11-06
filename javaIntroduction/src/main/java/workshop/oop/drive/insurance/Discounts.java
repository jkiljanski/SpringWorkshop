package workshop.oop.drive.insurance;

public interface Discounts {
  void calculateDiscount(DiscountCalculator discountCalculator);
  default boolean isAbsoluteDiscount(){
    return false;
  };
}
