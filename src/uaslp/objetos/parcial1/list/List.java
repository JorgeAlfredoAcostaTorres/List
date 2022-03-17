package uaslp.objetos.parcial1.list;

public interface List<T> {

    void addAtTail(T data);
    void addAtFront(T data);
    void remove(int index);
    void removeAll();
    void setAt(int index, T data);
    T getAt(int index);
    int getSize();
    Iterator<T> getIterator();
}
