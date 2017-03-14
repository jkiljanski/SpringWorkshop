package workshop.oop.drive.insurance;

public class InsuranceSexDiscount extends AbstractConditionRelativeDiscount{
    private final Sex expectedSex;

    public InsuranceSexDiscount(int discountPercentage, Sex expectedSex) {
        super(discountPercentage);
        this.expectedSex = expectedSex;
    }

    @Override
    protected boolean conditionMatches(int actPrice, Sex insuredSex) {
        return insuredSex == expectedSex;
    }
}
