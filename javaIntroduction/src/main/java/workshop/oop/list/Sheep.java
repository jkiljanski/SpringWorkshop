package workshop.oop.list;

public class Sheep {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sheep sheep = (Sheep) o;

        return name != null ? name.equals(sheep.name) : sheep.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String makeSound() {
        throw new MySheepException();
        //return "bla";
    }
}
