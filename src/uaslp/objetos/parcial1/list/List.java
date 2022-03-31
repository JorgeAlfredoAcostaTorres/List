package uaslp.objetos.parcial1.list;

import uaslp.objetos.parcial1.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;

public interface List<T> {

    void addAtTail(T data) throws NotNullValuesAllowedException;
    void addAtFront(T data) throws NotNullValuesAllowedException;
    void remove(int index) throws NotValidIndexException;
    void removeAll();
    void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException;
    T getAt(int index) throws NotValidIndexException;
    int getSize();
    Iterator<T> getIterator();
}
