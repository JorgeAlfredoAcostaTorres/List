package uaslp.objetos.parcial1.list.array.list;

public class ArrayListIterator {
    private ArrayList arrayList;
    private int currentItem;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public boolean hasNext() {
        return currentItem < arrayList.getSize();
    }

    public String next() {
        String data = arrayList.getAt(currentItem);

        currentItem++;

        return data;
    }
}
