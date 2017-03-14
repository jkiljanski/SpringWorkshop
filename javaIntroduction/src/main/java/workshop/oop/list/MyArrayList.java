package workshop.oop.list;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements MyList {

    private Object[] array = new Object[100];
    private int arrayIndex = 0;

    @Override
    public int size() {
        return arrayIndex;
    }

    @Override
    public boolean isEmpty() {
        return arrayIndex == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object o1 : array) {
            if (o1==o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        this.array[arrayIndex] = o;
        arrayIndex++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            this.add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        array[ index] = element;
        return true;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {

        Object deleted = array[index];
        array = ArrayUtils.remove(array, index);

        arrayIndex--;

        return deleted;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
