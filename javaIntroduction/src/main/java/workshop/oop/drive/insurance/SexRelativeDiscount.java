package workshop.oop.drive.insurance;

public class SexRelativeDiscount implements Discount{

    private RelativeDiscount relativeDiscount;
    private final Sex sex;

    public SexRelativeDiscount(Sex sex, int discount){
        this.sex = sex;
        relativeDiscount = new RelativeDiscount(discount);
    }
    @Override
    public int recalculatePrice(int price, Sex sexOnInsurance) {
        if(sex == sexOnInsurance){
            return relativeDiscount.recalculatePrice(price, sexOnInsurance);
        }
        return price;
    }
}
