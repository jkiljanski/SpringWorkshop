package workshop.oop.drive.insurance;

public class VIPRelativeDiscount extends ConditionalDiscount{

    public VIPRelativeDiscount(int percent) {
        super(
                (actualPrice, insuranceReport) -> actualPrice > 7000,
                new RelativeDiscount(percent)
        );
    }
}
