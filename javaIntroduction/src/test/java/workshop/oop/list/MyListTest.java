package workshop.oop.list;


import com.google.common.collect.Lists;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class MyListTest {

    private MyArrayList myList;

    @BeforeMethod
    public void setUp(){
        myList = new MyArrayList();
    }

    public void ex0IsEmpty(){
        //given

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
        boolean myListEmpty = myList.isEmpty();

        //then
        assertThat(size).isEqualTo(1);
        assertThat(myListEmpty).isFalse();
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
        assertThat(firstItem).isEqualTo("ccc");
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
        boolean doesContain4 = myList.contains(4);

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
        assertThat(myList.get(0)).isEqualTo(2);
        assertThat(myList.get(1)).isEqualTo(3);
    }

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void ex8ContainsThreeTypesOfObjects(){
        //given
        myList.add(1);

        //when
        myList.get(99);

        //then
    }

    public void ex9ContainsThreeTypesOfObjects(){
        //given
        myList.add(1);
        myList.add("second Object");
        myList.add(new Sheep("beee"));

        //when

        //then
        assertThat(myList.size()).isEqualTo(3);
        assertThat(myList.get(0)).isEqualTo(1);
        assertThat(myList.get(1)).isEqualTo("second Object");
        assertThat(myList.get(2)).isEqualTo(new Sheep("beee"));
    }

    public void ex_10ContainsThreeTypesOfObjects(){
        //given
        myList.add(1);
        myList.add("second Object");
        myList.add(new Sheep("beee"));

        //when
        Iterator iterator = myList.iterator();

        //then
        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(1);

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo("second Object");

        assertThat(iterator.hasNext()).isTrue();
        assertThat(iterator.next()).isEqualTo(new Sheep("beee"));

        assertThat(iterator.hasNext()).isFalse();
    }
}
