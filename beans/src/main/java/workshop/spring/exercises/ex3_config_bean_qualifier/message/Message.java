package workshop.spring.exercises.ex3_config_bean_qualifier.message;

public class Message {

  private String processedBy;

  //TODO: Look out this only available inside package
  void setProcessedBy(String processedBy) {

    this.processedBy = processedBy;
  }

  public String getProcessedBy() {

    return processedBy;
  }
}
