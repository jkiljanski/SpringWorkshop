package workshop.oop.list;

public interface Eater<T extends Eatable> {

  void eat(T object);
}
