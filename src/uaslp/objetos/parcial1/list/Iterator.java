package uaslp.objetos.parcial1.list;

import uaslp.objetos.parcial1.list.exception.NotValidIndexException;

public interface Iterator<T> {

    boolean hasNext();
    T next() throws NotValidIndexException;
}
