package workshop.oop.drive.insurance;

public class RelativeDiscount implements Discount{

    private final int discount;

    public RelativeDiscount(int discount){

        this.discount = discount;
    }

    @Override
    public int recalculatePrice(int price, Sex sex) {
        return price * (100 - discount)/100;
    }
}
