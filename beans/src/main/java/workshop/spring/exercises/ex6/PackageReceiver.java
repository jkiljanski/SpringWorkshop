package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PackageReceiver {

  @Autowired
  ApplicationEventPublisher applicationEventPublisher;


  public void receivedPackage(Package aPackage) {

    applicationEventPublisher.publishEvent(new PackageObtainedEvent(aPackage));

    // ...
    // ...
  }
}
