package workshop.oop.drive.insurance;

public class VipDiscountOCOperation implements OCOperation {
    public int percentDiscount;

    public VipDiscountOCOperation(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public void setInactive() {
        percentDiscount =0;
    }

    @Override
    public int calculate(int price, Sex sex){
        if (price < 5000) {
            return price;
        }
        return price - (percentDiscount * price / 100);
    }
}
