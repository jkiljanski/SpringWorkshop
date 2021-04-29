package workshop.oop.drive.insurance;

public class VipRelativeDiscount implements Discount{

    private static final int VIP_THRESHOLD = 6000;
    private RelativeDiscount relativeDiscount;

    public VipRelativeDiscount(int discount){
        relativeDiscount = new RelativeDiscount(discount);
    }

    @Override
    public int recalculatePrice(int price, Sex sex) {
        if (price > VIP_THRESHOLD) {
            return relativeDiscount.recalculatePrice(price, sex);
        }
        return price;
    }
}
