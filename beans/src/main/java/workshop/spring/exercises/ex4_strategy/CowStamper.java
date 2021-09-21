package workshop.spring.exercises.ex4_strategy;

@FunctionalInterface
public interface CowStamper {
  boolean apply(Cow cow);
}
