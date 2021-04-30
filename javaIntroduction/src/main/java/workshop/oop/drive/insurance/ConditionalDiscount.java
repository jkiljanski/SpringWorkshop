package workshop.oop.drive.insurance;

public class ConditionalDiscount implements Discount{

    private final InsurancePredicate condition;
    private final Discount discount;

    public ConditionalDiscount(InsurancePredicate condition, Discount discount) {
        this.condition = condition;
        this.discount = discount;
    }

    @Override
    public int recalculatePrice(int price, Sex sexOnInsurance) {
        if(condition.test(price, sexOnInsurance)){
            return discount.recalculatePrice(price, sexOnInsurance);
        }
        return price;
    }
}
