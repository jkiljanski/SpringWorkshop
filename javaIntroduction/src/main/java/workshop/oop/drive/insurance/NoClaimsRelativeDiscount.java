package workshop.oop.drive.insurance;

public class NoClaimsRelativeDiscount implements Discount {
    private final ConditionalDiscount conditionalDiscount;

    public NoClaimsRelativeDiscount(int discount) {
        conditionalDiscount = new ConditionalDiscount(
                (price, insuranceReport) -> insuranceReport.getClaims().isEmpty(),
                new RelativeDiscount(discount)
        );
    }

    @Override
    public int calculate(int actualPrice, InsuranceReport insuranceReport) {

        return conditionalDiscount.calculate(actualPrice, insuranceReport);
    }
}
