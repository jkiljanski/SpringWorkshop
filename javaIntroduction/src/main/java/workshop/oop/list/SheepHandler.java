package workshop.oop.list;

public class SheepHandler {

    void makeSoundFromSheep(Sheep sheep) throws Exception {
        try {
            sheep.makeSound();
        } catch (MySheepException e){
            System.out.println(e.getCause());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
