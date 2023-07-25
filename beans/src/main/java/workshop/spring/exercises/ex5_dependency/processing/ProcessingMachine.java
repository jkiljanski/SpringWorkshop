package workshop.spring.exercises.ex5_dependency.processing;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import workshop.spring.exercises.ex5_dependency.Element;

@Component
public class ProcessingMachine implements InitializingBean {

  @Autowired
  private FieldProcessor fieldProcessor;

  private SetterProcessor setterProcessor;

  private final ConstructorProcessor constructorProcessor;

  @Autowired
  public ProcessingMachine(ConstructorProcessor constructorProcessor) {
    this.constructorProcessor = constructorProcessor;
    constructorProcessor.activate();
  }

  public void afterPropertiesSet(){
    fieldProcessor.activate();
  }


  @Autowired(required = false)
  public void setSetterProcessor(SetterProcessor setterProcessor) {
    this.setterProcessor = setterProcessor;
    setterProcessor.activate();
  }

  public void processElement(Element element) {

    fieldProcessor.processElement(element);
    setterProcessor.processElement(element);
    constructorProcessor.processElement(element);


  }
}
