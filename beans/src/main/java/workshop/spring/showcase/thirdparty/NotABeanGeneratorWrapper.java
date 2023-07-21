package workshop.spring.showcase.thirdparty;

import workshop.spring.showcase.EmailGenerator;

//has no @Component annotation
public class NotABeanGeneratorWrapper {

  private final EmailGenerator emailGenerator;
  private String description;

  public NotABeanGeneratorWrapper(EmailGenerator emailGenerator) {

    this.emailGenerator = emailGenerator;
  }

  public String generate() {

    return "wrapped with [" + description + "]: " + emailGenerator.generate();
  }

  public NotABeanGeneratorWrapper withDescription(String description) {

    this.description = description;

    return this;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
