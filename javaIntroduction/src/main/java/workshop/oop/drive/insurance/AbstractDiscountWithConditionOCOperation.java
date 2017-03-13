package workshop.oop.drive.insurance;

public abstract class AbstractDiscountWithConditionOCOperation implements OCOperation {

    private final RelativeDiscountOCOperation relativeDiscountOCOperation;

    protected AbstractDiscountWithConditionOCOperation(int discountPercentage) {
        this.relativeDiscountOCOperation = new RelativeDiscountOCOperation(discountPercentage);
    }


    @Override
    public void setInactive() {
        relativeDiscountOCOperation.setInactive();
    }


    @Override
    public int calculate(int price, Sex sex){
        if (applies(price, sex)) {
            return relativeDiscountOCOperation.calculate(price, sex);
        }
        return price;
    }

    protected abstract boolean applies(int price, Sex sex);
}
