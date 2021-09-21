package workshop.spring.exercises.ex5_dependency.processing;

import workshop.spring.exercises.ex5_dependency.Element;

abstract public class BaseController {
  private boolean activated;

  public void processElement(Element element) {

    if (activated) {
      element.wasProcessedBy(this.getClass().getSimpleName());
    }
  }

  public void activate() {

    activated = true;
  }

}
