package workshop.oop.drive.insurance;

public class VIPRelativeDiscount implements Discount {
    private Discount relativeDiscount;

    public VIPRelativeDiscount(int percent) {
        relativeDiscount = new RelativeDiscount(percent);
    }

    @Override
    public int calculate(int actualPrice, InsuranceReport insuranceReport) {
        if (actualPrice > 7000) {
            return this.relativeDiscount.calculate(actualPrice, insuranceReport);
        }
        return actualPrice;
    }
}
