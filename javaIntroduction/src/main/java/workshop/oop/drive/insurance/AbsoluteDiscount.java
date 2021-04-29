package workshop.oop.drive.insurance;

public class AbsoluteDiscount implements Discount {

    private final int discount;

    public AbsoluteDiscount(int discount){
        this.discount = discount;
    }
    @Override
    public int recalculatePrice(int price, Sex sex) {
        return price - discount;
    }
}
