package workshop.oop.drive.insurance;

public class InsuranceRelativeDiscount implements InsuranceDiscount {

    private int discountPercentage;

    public InsuranceRelativeDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int calculatePrice(int actPrice, Sex insuredSex) {
        actPrice -= (actPrice * discountPercentage / 100);
        return actPrice;
    }
}
