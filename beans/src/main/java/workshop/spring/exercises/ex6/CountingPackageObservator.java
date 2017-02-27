package workshop.spring.exercises.ex6;

import org.springframework.stereotype.Service;

@Service
public class CountingPackageObservator implements PackageObservator {

    private int counter;

    public int getNumberOfPackages() {
        return counter;
    }

    public void notify(Package aPackage) {
        counter++;
    }
}
