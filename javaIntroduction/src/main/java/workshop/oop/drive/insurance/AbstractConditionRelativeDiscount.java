package workshop.oop.drive.insurance;

public abstract class AbstractConditionRelativeDiscount extends AbstractConditionDiscount {

    public AbstractConditionRelativeDiscount(int discountPercentage) {
        super(new InsuranceRelativeDiscount(discountPercentage));
    }
}
