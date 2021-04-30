package workshop.oop.drive.cars;

public enum CarColor implements CarElementDescribable {

    RED, BLUE, GREEN, WHITE, BLACK;

    @Override
    public String describeYourself() {

        return this.name().toLowerCase();
    }
}
