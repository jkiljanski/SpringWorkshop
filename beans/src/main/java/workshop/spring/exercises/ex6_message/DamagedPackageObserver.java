package workshop.spring.exercises.ex6_message;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Order(1)
@Component
public class DamagedPackageObserver implements PackageObserver {


  private final AlertMailSender alertMailSender;

  private List<Integer> damagedPackages = new ArrayList<>();

  public DamagedPackageObserver(AlertMailSender alertMailSender) {
    this.alertMailSender = alertMailSender;
  }

  @Order(1)
  @EventListener
  @Override
  public void notifyPackageArrived(Package pack) {

    if(pack.isDamaged){

      damagedPackages.add(pack.number);
    }

    if(damagedPackages.size() >= 5){
      alertMailSender.sendMessageAboutInvalidPackages(damagedPackages);
      throw new TooManyPackagesDamagedException();
    }

  }
}
