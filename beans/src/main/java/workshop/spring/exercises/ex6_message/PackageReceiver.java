package workshop.spring.exercises.ex6_message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PackageReceiver {


  @Autowired
  List<PackageObserver> packageObservers;


  public void receivedPackage(Package aPackage) {

    packageObservers.forEach(o -> o.notifyPackageArrived(aPackage));
  }
}
