package workshop.spring.exercises.ex5;

public interface CowStampler {

  String getStamp();
  boolean applies(Cow cow);

  default boolean stamp(Cow cow) {
    if(applies(cow)){
      cow.setStamp(getStamp());
      return true;
    }
    return false;
  }
}
