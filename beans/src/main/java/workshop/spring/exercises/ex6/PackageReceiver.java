package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class PackageReceiver {

    @Autowired
    List<PackageObserver> packageObservers;


    public void receivedPackage(Package aPackage) {
        for (PackageObserver packageObserver : packageObservers) {
            packageObserver.notify(aPackage);
        }
    }

    public CountingPackageObserver getCountingPackageObserver() {

        return (CountingPackageObserver) packageObservers.get(1);
    }
}
