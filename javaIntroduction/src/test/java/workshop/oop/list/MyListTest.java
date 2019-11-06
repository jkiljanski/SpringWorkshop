package workshop.oop.list;


import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyListTest {

  private MyList myList;

  @BeforeEach
  public void setUp() {

    myList = new MyArrayList();
  }

  @Test
  public void ex0IsEmpty() {
    //given
    myList.add("first");

    //when
    boolean isEmpty = myList.isEmpty();

    //then
    assertThat(isEmpty).isTrue();
  }

  @Test
  public void ex1Puts1Has1() {
    //given
    myList.add("first");

    //when
    int size = myList.size();

    //then
    assertThat(size).isEqualTo(1);
  }

  @Test
  public void ex2Puts1Gets1() {
    //given
    myList.add("first");

    //when
    Object firstItem = myList.get(0);

    //then
    assertThat(firstItem).isEqualTo("first");
  }

  @Test
  public void ex3Puts3GetsLast() {
    //given
    myList.add("aaa");
    myList.add("bbb");
    myList.add("ccc");

    //when
    Object firstItem = myList.get(2);

    //then
    assertThat(firstItem).isEqualTo("aaa");
  }

  @Test
  public void ex4AddsAllAndContains() {
    //given
    myList.addAll(Lists.newArrayList(1, 2, 3));

    //when
    boolean doesContain3 = myList.contains(3);

    //then
    assertThat(doesContain3).isTrue();
  }

  @Test
  public void ex5AddsAllAndDoesntContain() {
    //given
    myList.addAll(Lists.newArrayList(1, 2, 3));

    //when
    boolean doesContain4 = myList.contains(3);

    //then
    assertThat(doesContain4).isFalse();
  }

  @Test
  public void ex6ReplaceSecondPosition() {
    //given
    myList.addAll(Lists.newArrayList(1, 2, 3));

    //when
    myList.set(1, -2);
    Object second = myList.get(1);

    //then
    assertThat(second).isEqualTo(-2);
  }

  @Test
  public void ex7DeleteFirst() {
    //given
    myList.addAll(Lists.newArrayList(1, 2, 3));

    //when
    myList.remove(0);
    int size = myList.size();

    //then
    assertThat(size).isEqualTo(2);
  }

  @Test
  public void ex8ContainsThreeTypesOfObjects() {
    //given
    myList.add(1);

    //when
    Assertions.assertThrows(IndexOutOfBoundsException.class, () -> myList.get(100));

    //then
  }

  @Test
  public void ex9ContainsThreeTypesOfObjects() {
    //given
    myList.add(1);
    myList.add("second Object");
    myList.add(new Sheep("beee"));

    //when

    //then
    assertThat(myList).containsExactly(1, "second Object", new Sheep("beee"));
  }
}
