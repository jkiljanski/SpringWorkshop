package workshop.oop.list;

import java.util.Arrays;
import java.util.Collection;

public class Animal<MAIN_TYPE> {
  String name;

  Animal(final String name) {

    this.name = name;
  }

  public static <TYPE> Collection<TYPE> toCollection(TYPE object){

    return Arrays.asList(object, object);
  }
}
