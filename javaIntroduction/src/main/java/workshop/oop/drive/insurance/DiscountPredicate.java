package workshop.oop.drive.insurance;

public interface DiscountPredicate {
    boolean shouldApply(int price, InsuranceReport insuranceReport);
}
