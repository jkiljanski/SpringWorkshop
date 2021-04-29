package workshop.oop.drive.insurance;

public interface Discount {

    int recalculatePrice(int price, Sex sexOnInsurance);
}
