package uaslp.objetos.parcial1.list.array.list;

import uaslp.objetos.parcial1.list.Iterator;

public class ArrayListIterator implements Iterator {
    private uaslp.objetos.parcial1.list.array.list.ArrayList arrayList;
    private int currentItem;

    public ArrayListIterator(uaslp.objetos.parcial1.list.array.list.ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return currentItem < arrayList.getSize();
    }

    @Override
    public String next() {
        String data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}
