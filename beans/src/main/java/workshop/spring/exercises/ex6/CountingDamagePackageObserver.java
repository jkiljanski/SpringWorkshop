package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value="prototype")
public class CountingDamagePackageObserver implements PackageObserver {

    List<Integer> invalidPackagesIds = new ArrayList<>();

    private final MailSender mailSender;

    @Autowired
    public CountingDamagePackageObserver(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void notify(Package aPackage) {
        if (aPackage.isDamaged()) {
            invalidPackagesIds.add(aPackage.getNumber());

            if(invalidPackagesIds.size() == 5) {
                mailSender.sendMessageAboutInvalidPackages(invalidPackagesIds);
            }
        }
    }

   }
