package uaslp.objetos.parcial1.list.array.list;

import uaslp.objetos.parcial1.list.Iterator;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;

public class ArrayListIterator<T> implements Iterator<T> {
    private final ArrayList<T> arrayList;
    private int currentItem;

    public ArrayListIterator(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return currentItem < arrayList.getSize();
    }

    @Override
    public T next() throws NotValidIndexException {
        T data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}
