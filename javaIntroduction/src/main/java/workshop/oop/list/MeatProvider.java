package workshop.oop.list;

public interface MeatProvider {
  int howMuchMeat();
  default int getPerfromance(){
    return 5;
  }
}
