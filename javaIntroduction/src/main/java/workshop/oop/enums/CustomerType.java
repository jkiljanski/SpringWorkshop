package workshop.oop.enums;

public enum CustomerType {
    POOR(100), MEDIUM(500), RICH(100000000);

    private final int amountToSpend;

    CustomerType(int amountToSpend) {
        this.amountToSpend = amountToSpend;
    }
}
