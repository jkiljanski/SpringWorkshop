package workshop.oop.list;

import workshop.oop.list.Sheep.Wool;

public interface WoolProvider {
  Wool getSomeWool();

  default int getPerfromance(){
    return 5;
  }
}
