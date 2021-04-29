package workshop.oop.drive;

public enum CarColour {
    BLUE("blue"), WHITE("white"), BLACK("black");

    private String description;

    CarColour(String description) {

        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
