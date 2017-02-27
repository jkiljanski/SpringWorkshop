package workshop.spring.exercises.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Scope("prototype")
@Service
public class QualityCheckObservator implements PackageObservator{

    @Autowired
    MailSender mailSender;

    List<Integer> demaged = new LinkedList<>();

    public void notify(Package aPackage) {
        if(aPackage.isDamaged()) {
            demaged.add(aPackage.getNumber());
        }
        if(demaged.size() >= 5) {
            mailSender.sendMessageAboutInvalidPackages(demaged);
        }
    }

}
