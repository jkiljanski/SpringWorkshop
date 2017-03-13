package workshop.oop.list;


import com.google.common.collect.Lists;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MyListTest {

    private MyList myList;

    @BeforeMethod
    public void setUp(){
        myList = new MyArrayList();
    }

    public void ex0IsEmpty(){
        //given
        myList.add("first");

        //when
        boolean isEmpty = myList.isEmpty();

        //then
        assertThat(isEmpty).isTrue();
    }

    public void ex1Puts1Has1(){
        //given
        myList.add("first");

        //when
        int size = myList.size();

        //then
        assertThat(size).isEqualTo(1);
    }

    public void ex2Puts1Gets1(){
        //given
        myList.add("first");

        //when
        Object firstItem = myList.get(0);

        //then
        assertThat(firstItem).isEqualTo("first");
    }

    public void ex3Puts3GetsLast(){
        //given
        myList.add("aaa");
        myList.add("bbb");
        myList.add("ccc");

        //when
        Object firstItem = myList.get(2);

        //then
        assertThat(firstItem).isEqualTo("aaa");
    }

    public void ex4AddsAllAndContains(){
        //given
        myList.addAll(Lists.newArrayList(1,2,3));

        //when
        boolean doesContain3 = myList.contains(3);

        //then
        assertThat(doesContain3).isTrue();
    }

    public void ex5AddsAllAndDoesntContain(){
        //given
        myList.addAll(Lists.newArrayList(1,2,3));

        //when
        boolean doesContain4 = myList.contains(3);

        //then
        assertThat(doesContain4).isFalse();
    }

    public void ex6ReplaceSecondPosition(){
        //given
        myList.addAll(Lists.newArrayList(1,2,3));

        //when
        myList.set(1, -2);
        Object second = myList.get(1);

        //then
        assertThat(second).isEqualTo(-2);
    }

    public void ex7DeleteFirst(){
        //given
        myList.addAll(Lists.newArrayList(1,2,3));

        //when
        myList.remove(0);
        int size = myList.size();

        //then
        assertThat(size).isEqualTo(2);
    }

    public void ex8ContainsThreeTypesOfObjects(){
        //given
        myList.add(1);
        myList.add("second Object");
        myList.add(new Sheep("beee"));

        //when

        //then
        assertThat(myList).containsExactly(1, "second Object", new Sheep("beee"));
    }
}
