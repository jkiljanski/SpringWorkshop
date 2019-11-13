package workshop.spring.exercises.ex6;


import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class StopOnFailedPackagesObserver {
  private int amountOfDamagePackages;

  @Order(1)
  @EventListener
  public void onPackage(PackageObtainedEvent event) {

    if (amountOfDamagePackages == 5) {
      throw new TooManyPackagesDamagedException("");
    }
    if (event.aPackage.isDamaged()) {
      amountOfDamagePackages++;
    }
  }

  void reset() {
    amountOfDamagePackages = 0;
  }
}
