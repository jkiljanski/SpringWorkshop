package workshop.oop.drive.insurance;

public class AbsoluteDiscount implements Discount{
    private int value;

    public AbsoluteDiscount(int value) {
        this.value = value;
    }

    @Override
    public int calculate(int actualPrice, InsuranceReport insuranceReport) {
        return actualPrice - value;
    }
}
