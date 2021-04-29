package workshop.oop.drive.insurance;

public class OCInsurance {

  private final int price;

  private int discount;
  private int relativeDiscount;
  private static final int VIP_THRESHOLD = 6000;
  private int vipRelativeDiscount;



  public OCInsurance(int price) {
    this.price = price;
  }


  public int calculateFinalPrice() {
    int finalPrice = (price - discount)*(100 - relativeDiscount)/100;
    if(finalPrice>VIP_THRESHOLD){
      finalPrice = finalPrice*(100 - vipRelativeDiscount)/100;
    }
    return finalPrice;
  }

  public void addAbsoluteDiscount(int discount) {
   // price = price-discount;
    this.discount+=discount;
  }

  public void addRelativeDiscount(int relativeDiscount) {
    this.relativeDiscount += relativeDiscount;
  }

  public void removeAbsoluteDiscounts() {
    discount = 0;
  }

  public void addVIPRelativeDiscount(int vipRelativeDiscount) {
    this.vipRelativeDiscount += vipRelativeDiscount;
  }
}
