package workshop.spring.exercises.ex4.processing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex4.Element;
import workshop.spring.exercises.ex4.QualifierNames;

import javax.annotation.PostConstruct;

@Component
public class FullyActivatedProcessingMachine {
    @Autowired
    @Qualifier(QualifierNames.FIELD_INJECTION)
    private ActivationNeedingProcessor fieldInjected;

    private final ActivationNeedingProcessor injectedByConstructor;
    private ActivationNeedingProcessor injectedBySetter;

    @Autowired
    public FullyActivatedProcessingMachine(@Qualifier(QualifierNames.CONSTRUCTOR_INJECTION) ActivationNeedingProcessor injectedByConstructor) {
        this.injectedByConstructor = injectedByConstructor;
        injectedByConstructor.activate();
    }

    @PostConstruct
    public void initial(){
        fieldInjected.activate();

    }

    @Autowired
    public void setInjectedBySetter(@Qualifier(QualifierNames.SETTER_INJECTION)ActivationNeedingProcessor injectedBySetter) {
        this.injectedBySetter = injectedBySetter;
        injectedBySetter.activate();
    }

    public void processElement(Element element){

        fieldInjected.processElement(element);
        injectedByConstructor.processElement(element);
        injectedBySetter.processElement(element);
    }
}
