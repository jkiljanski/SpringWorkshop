package workshop.oop.drive.insurance;

public class RelativeDiscountOCOperation implements OCOperation {
    public int discountPercent;

    public RelativeDiscountOCOperation(int discountPercent) {

        this.discountPercent = discountPercent;
    }

    @Override
    public void setInactive() {
        discountPercent =0;
    }

    @Override
    public int calculate(int price, Sex sex){
        return price- (discountPercent * price / 100);
    }
}
