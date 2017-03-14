package workshop.oop.drive.insurance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OCInsurance {

    private final int price;
    List<InsuranceDiscount> discounts = new ArrayList<>();
    private Sex insuredSex;

    public OCInsurance(int price) {
        this(Sex.MALE, price);
    }

    public OCInsurance(Sex insuredSex, int price) {
        this.insuredSex = insuredSex;
        this.price = price;
    }

    public int calculateFinalPrice() {
        int actPrice = this.price;
        for (InsuranceDiscount discount : discounts) {
            actPrice = discount.calculatePrice(actPrice, insuredSex);
        }

        return actPrice;

    }

    public void removeAbsoluteDiscounts() {
        Iterator<InsuranceDiscount> iterator = discounts.iterator();

        while (iterator.hasNext()) {
            InsuranceDiscount next = iterator.next();
            if (next.getClass() == InsuranceAbsoluteDiscount.class) {
                iterator.remove();
            }
        }
    }


    public boolean addDiscout(InsuranceDiscount discount) {
        return discounts.add(discount);
    }

    public void sexChanged(Sex sex) {

        this.insuredSex = sex;
    }
}
