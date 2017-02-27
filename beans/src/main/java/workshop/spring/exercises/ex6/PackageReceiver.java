package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageReceiver {

    private List<PackageObservator> observers;

    @Autowired
    ObjectFactory<List<PackageObservator>> observersProvider;

    public void receivedPackage(Package aPackage) {
        for (PackageObservator observer : observers) {
            observer.notify(aPackage);
        }

    }

    public void startReceiving() {
        observers = observersProvider.getObject();
    }
}
