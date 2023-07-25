package workshop.spring.exercises.ex6_message;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class CountingPackageObserver implements PackageObserver {
  private int counter;

  public int getNumberOfPackages() {

    return counter;
  }

  @Override
  public void notifyPackageArrived(Package pack) {

    counter++;

  }
}
