package workshop.spring.exercises.ex4.processing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex4.Element;
import workshop.spring.exercises.ex4.QualifierNames;

@Component
public class SimpleProcessingMachine {

  @Autowired
  @Qualifier(QualifierNames.A)
  private ActivationNeedingProcessor fieldInjected;

  private final ActivationNeedingProcessor injectedByConstructor;
  private ActivationNeedingProcessor injectedBySetter;

  @Autowired
  public SimpleProcessingMachine(@Qualifier(QualifierNames.B)
      ActivationNeedingProcessor injectedByConstructor) {

    this.injectedByConstructor = injectedByConstructor;
  }

  @Autowired
  public void setInjectedBySetter(
      @Qualifier(QualifierNames.C) ActivationNeedingProcessor injectedBySetter) {

    this.injectedBySetter = injectedBySetter;
  }

  public void processElement(Element element) {

    fieldInjected.processElement(element);
    injectedByConstructor.processElement(element);
    injectedBySetter.processElement(element);
  }
}
