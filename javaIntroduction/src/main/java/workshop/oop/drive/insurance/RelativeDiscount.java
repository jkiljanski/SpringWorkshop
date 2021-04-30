package workshop.oop.drive.insurance;

public class RelativeDiscount implements Discount {
    private int procentValue;

    public RelativeDiscount(int procentValue) {
        this.procentValue = procentValue;
    }

    @Override
    public int calculate(int actualPrice) {
        return actualPrice * (100 - procentValue)/100;
    }
}
