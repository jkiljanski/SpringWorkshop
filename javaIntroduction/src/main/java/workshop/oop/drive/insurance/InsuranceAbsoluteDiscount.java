package workshop.oop.drive.insurance;

public class InsuranceAbsoluteDiscount implements InsuranceDiscount {


    private int discountValue;

    public InsuranceAbsoluteDiscount(int discountValue) {

        this.discountValue = discountValue;
    }
    public int calculatePrice(int actPrice, Sex insuredSex) {
        actPrice -= discountValue;
        return actPrice;
    }

}
