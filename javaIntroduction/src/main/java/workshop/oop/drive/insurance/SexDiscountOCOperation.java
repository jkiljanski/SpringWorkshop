package workshop.oop.drive.insurance;

public class SexDiscountOCOperation extends AbstractDiscountWithConditionOCOperation
        implements OCOperation {
    private final Sex handledSex;

    public SexDiscountOCOperation(Sex handledSex, int percentDiscount) {
        super(percentDiscount);
        this.handledSex = handledSex;
    }

    @Override
    protected boolean applies(int price, Sex sex) {
        return this.handledSex.equals(sex);
    }

}
