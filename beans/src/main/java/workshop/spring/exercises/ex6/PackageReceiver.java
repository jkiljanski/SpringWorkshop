package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageReceiver {

    @Autowired
    private List<PackageObservator> observers;



    public void receivedPackage(Package aPackage) {
        for (PackageObservator observer : observers) {
            observer.notify(aPackage);
        }

    }

    public void startReceiving() {

    }
}
