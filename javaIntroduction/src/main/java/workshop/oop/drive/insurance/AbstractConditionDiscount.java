package workshop.oop.drive.insurance;

public abstract class AbstractConditionDiscount implements InsuranceDiscount{

    private final InsuranceDiscount innerDiscount;

    protected AbstractConditionDiscount(InsuranceDiscount innerDiscount) {
        this.innerDiscount = innerDiscount;
    }

    @Override
    public int calculatePrice(int actPrice, Sex insuredSex) {
        if(conditionMatches(actPrice, insuredSex)){
            return innerDiscount.calculatePrice(actPrice, insuredSex);
        }
        return actPrice;
    }

    protected abstract boolean conditionMatches(int actPrice, Sex insuredSex);
}
