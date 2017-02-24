package workshop.oop.drive.insurance;

import java.util.LinkedList;
import java.util.List;

public class OCInsurance {
    private final Sex sex;
    private final int origPrice;
    private List<OCOperation> operations = new LinkedList<>();

    public OCInsurance(int price) {
        this(Sex.MALE, price);
    }

    public OCInsurance(Sex sex, int price) {
        this.sex = sex;
        origPrice = price;
    }

    public int calculateFinalPrice() {
        int price;
        price = origPrice;
        for (OCOperation operation : operations) {
            price = operation.calculate(price, sex);
        }
        return price;
    }

    public void addOperation(OCOperation ocOperation) {
        operations.add(ocOperation);
    }

    public void removeAbsoluteDiscounts() {
        for (OCOperation operation : operations) {
            if (operation instanceof AbsoluteDiscountOCOperation) {
                operation.setInactive();
            }
        }
    }

}
