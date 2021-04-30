package workshop.oop.drive.insurance;

public class ConditionalDiscount implements Discount{

    private final DiscountPredicate discountPredicate;
    private final Discount discount;


    public ConditionalDiscount(DiscountPredicate discountPredicate, Discount discount) {
        this.discountPredicate = discountPredicate;
        this.discount = discount;
    }


    @Override
    public int calculate(int actualPrice, InsuranceReport insuranceReport) {
        if(discountPredicate.shouldApply(actualPrice, insuranceReport)){
            return discount.calculate(actualPrice, insuranceReport);
        }
        return actualPrice;
    }
}
