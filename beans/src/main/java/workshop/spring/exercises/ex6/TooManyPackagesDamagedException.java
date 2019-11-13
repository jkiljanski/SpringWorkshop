package workshop.spring.exercises.ex6;

public class TooManyPackagesDamagedException extends RuntimeException {
  public TooManyPackagesDamagedException(final String message) {

    super(message);
  }
}
