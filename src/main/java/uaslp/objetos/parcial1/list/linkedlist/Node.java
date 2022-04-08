package uaslp.objetos.parcial1.list.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> previous;

    Node(T data) {
        this.data = data;
    }
}
