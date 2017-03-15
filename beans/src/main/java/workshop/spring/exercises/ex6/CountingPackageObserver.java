package workshop.spring.exercises.ex6;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value="prototype")
public class CountingPackageObserver implements PackageObserver {
    private int counter = 0;

    @PostConstruct
    public void beanCreated(){
        System.out.println("Created bean: "+this);
    }


    public int getNumberOfPackages() {
        return counter;
    }

    @Override
    public void notify(Package aPackage) {
        counter++;
    }


}
