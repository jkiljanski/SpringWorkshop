package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CountingPackageObservator implements PackageObservator {

    int i =0;

    @Autowired
    CounterHolder counterHolder;


    public void notify(Package aPackage) {
        i++;
        counterHolder.setCurrentCounter(i);
    }
}
