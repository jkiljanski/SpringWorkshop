package workshop.oop.drive.insurance;

public class VipDiscountOCOperation extends AbstractDiscountWithConditionOCOperation
        implements OCOperation {

    public VipDiscountOCOperation(int percentDiscount) {
        super(percentDiscount);
    }

    @Override
    protected boolean applies(int price, Sex sex) {
        return price >= 5000;
    }

}
