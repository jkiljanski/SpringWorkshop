package workshop.oop.drive;

public enum FuelType {
  GAS(123f), ELECTRICITY(678f), MANUAL(0f),
  HYDROGEN(23f){
    @Override
    void doSmth() {
      super.doSmth();
    }
  };


  private final float price;

  FuelType(float price) {
    this.price = price;
  }

  float getPrice(){
    return price;
  }

  void doSmth(){
    //bla bla
  }
}
