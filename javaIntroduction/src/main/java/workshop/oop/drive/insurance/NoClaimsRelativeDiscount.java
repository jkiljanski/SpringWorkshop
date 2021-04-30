package workshop.oop.drive.insurance;

public class NoClaimsRelativeDiscount implements Discount {
    private final RelativeDiscount relativeDiscount;

    public NoClaimsRelativeDiscount(int discount) {
        relativeDiscount = new RelativeDiscount(discount);
    }

    @Override
    public int calculate(int actualPrice, InsuranceReport insuranceReport) {
        if (insuranceReport.getClaims().isEmpty()) {
            return relativeDiscount.calculate(actualPrice, insuranceReport);
        }
        return actualPrice;
    }
}
