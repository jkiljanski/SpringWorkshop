package workshop.oop.drive.insurance;

public class OCInsurance {
  private int price;

  public OCInsurance(int price) {

    this.price = price;
  }

  public int calculateFinalPrice() {

    return price;
  }

  public void addAbsoluteDiscount(int amount) {
    this.price -= amount;
  }

  public void addRelativeDiscount(int percent) {
    this.price -= this.price*percent/100;
  }

  public void removeAbsoluteDiscounts() {
    //this.price =
  }
}
