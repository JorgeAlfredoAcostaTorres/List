package uaslp.objetos.parcial1.list.linkedlist;

public class Node {
    private String data;
    private String next;
    private String previous;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }
}
