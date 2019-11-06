package workshop.oop.list;

public class Sheep extends Animal implements WoolProvider, MeatProvider, Eater<Grass> {
  private String name;
  private String name2;

  public Sheep() {

    super("Baaasia");
    final Wool wool = new Wool() {
      @Override public void doSmth(final int i) {

        System.out.println("I am wool");
      }
    };
  }

  public void doSmth(String name) {

    String name2;
    super.name = name;
  }

  @Override public int howMuchMeat() {

    return 0;
  }

  @Override public Wool getSomeWool() {

    return null;
  }

  @Override public int getPerfromance() {

    return WoolProvider.super.getPerfromance();
  }

  @Override public void eat(final Grass grass) {

    if (!grass.isMyFavouriteKind()) {
      new RuntimeException("puke!");
    }
    if (grass.getAmount() > 100) {
      new RuntimeException("puke!");
    }
    return;
  }




@FunctionalInterface
interface Wool {
  void doSmth(int i);
}



  public static void main(String[] args) {

    final Sheep sheep = new Sheep();

    sheep.eat(new Grass());


  }
}
