package workshop.oop.drive.insurance;

import io.vavr.Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OCInsurance {
  private final int price;
  private List<Discount> queue = new ArrayList<>();


  public OCInsurance(int price) {
    this.price = price;
  }

  public int calculateFinalPrice() {
    int actualPrice = this.price;
    for (Discount discount : queue) {
      actualPrice = discount.calculate(actualPrice);
    }
    return actualPrice;
  }


  public void addAbsoluteDiscount(int amount) {
      this.queue.add(new AbsoluteDiscount(amount));
  }

  public void addRelativeDiscount(int percent) {
    this.queue.add(new RelativeDiscount(percent));
  }

  public void removeAbsoluteDiscounts() {

    this.queue = queue.stream()
            .filter(Predicates.not(discount -> discount instanceof AbsoluteDiscount))
            .collect(Collectors.toList());
  }

  public void addVIPRelativeDiscount(int percentVIP) {
    this.queue.add(new VIPRelativeDiscount(percentVIP));
  }
}
