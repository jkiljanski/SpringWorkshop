package workshop.spring.exercises.ex6_message;

import java.util.Collection;

public interface AlertMailSender {
  void sendMessageAboutInvalidPackages(Collection<Integer> packageNumbers);
}
