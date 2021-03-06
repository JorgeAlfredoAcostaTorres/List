package uaslp.objetos.parcial1.list.array.list;

import uaslp.objetos.parcial1.list.Iterator;
import uaslp.objetos.parcial1.list.List;
import uaslp.objetos.parcial1.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;

public class ArrayList<T> implements List<T> {
    public static final int DEFAULT_SIZE = 50;
    private T[] array;
    private int size;

    public ArrayList() {
        array = (T[]) new Object[DEFAULT_SIZE];
    }

    public ArrayList(int size) {
        array = (T[]) new Object[size];
    }

    @Override
    public void addAtTail(T data) throws NotNullValuesAllowedException {
        if(data == null) {
            throw new NotNullValuesAllowedException();
        }

        if(size == array.length) {
            increaseArraySize();
        }

        array[size] = data;
        size++;
    }

    @Override
    public void addAtFront(T data) throws NotNullValuesAllowedException{
        if(data == null) {
            throw new NotNullValuesAllowedException();
        }

        if(size == array.length) {
            increaseArraySize();
        }

        if (size >= 0) {
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0] = data;
        size++;
    }

    @Override
    public void remove(int index) throws NotValidIndexException {
        if(index < 0 || index >= size) {
            throw new NotValidIndexException(index);
        }

        if (size - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public void removeAll() {
        for(int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @Override
    public void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException{
        if(data == null) {
            throw new NotNullValuesAllowedException();
        }

        if(index >= 0 && index <size) {
            array[index] = data;
        } else {
            throw new NotValidIndexException(index);
        }
    }

    @Override
    public T getAt(int index) throws NotValidIndexException {
        if (index < 0 || index >= size) {
            throw new NotValidIndexException(index);
        } else {
            return array[index];
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> getIterator() {
        return new ArrayListIterator<>(this);
    }

    private void increaseArraySize() {
        T []newArray = (T[]) new Object[array.length * 2];

        if (size >= 0) System.arraycopy(array, 0, newArray, 0, size);

        array = newArray;
    }
}
