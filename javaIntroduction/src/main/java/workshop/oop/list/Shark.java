package workshop.oop.list;

public class Shark implements Eater<Meat> {
  @Override public void eat(final Meat meat) {

    System.out.println("Eating meat! " + meat);
  }
}
