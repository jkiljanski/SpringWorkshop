package workshop.oop.drive.insurance;

public class SexDiscountOCOperation implements OCOperation {
    private Sex sex;
    public int percentDiscount;

    public SexDiscountOCOperation(Sex sex, int percentDiscount) {
        this.sex = sex;
        this.percentDiscount = percentDiscount;
    }

    @Override
    public void setInactive() {
        percentDiscount =0;
    }

    @Override
    public int calculate(int price, Sex sex){
        if(sexMatches(sex)) {
            return price - percentDiscount * price / 100;
        }
        return price;
    }

    private boolean sexMatches(Sex sex) {
        return this.sex.equals(sex);
    }
}
