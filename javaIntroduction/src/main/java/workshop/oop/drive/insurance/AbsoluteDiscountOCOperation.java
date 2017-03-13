package workshop.oop.drive.insurance;

public class AbsoluteDiscountOCOperation implements OCOperation {
    public int discount;

    public AbsoluteDiscountOCOperation(int discount) {
        this.discount = discount;
    }

    @Override
    public void setInactive() {
        discount=0;
    }

    @Override
    public int calculate(int price, Sex sex){
        return price-discount;
    }
}
