package workshop.oop.drive.insurance;

public class InsuranceVipRelativeDiscount extends AbstractConditionRelativeDiscount {


    public InsuranceVipRelativeDiscount(int discountPercentage) {
        super(discountPercentage);
    }

    @Override
    protected boolean conditionMatches(int actPrice, Sex insuredSex) {
        return actPrice > 5000;
    }
}
