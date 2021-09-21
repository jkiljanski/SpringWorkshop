package workshop.spring.exercises.ex5_dependency;

import com.google.common.collect.Sets;
import java.util.Set;

public class Element {

  private Set<String> processedBy = Sets.newHashSet();

  public void wasProcessedBy(String id) {

    processedBy.add(id);
  }

  public Set<String> getProcessedBy() {

    return processedBy;
  }
}
