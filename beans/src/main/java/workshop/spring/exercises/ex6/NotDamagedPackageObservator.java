package workshop.spring.exercises.ex6;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class NotDamagedPackageObservator {

  private int numberOfPackages;

  @Order(10)
  @EventListener/*(classes = PackageObtainedEvent.class)*/
  public void onPackageReceived(PackageObtainedEvent packageObtainedEvent){
    if (packageObtainedEvent.aPackage.isDamaged()) numberOfPackages++;
  }

  int getNumberOfPackages() {

    return numberOfPackages;
  }

  void reset() {
      numberOfPackages = 0;
  }
}
