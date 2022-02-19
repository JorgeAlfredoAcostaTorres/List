import uaslp.objetos.parcial1.list.linkedlist.LinkedList;
import uaslp.objetos.parcial1.list.linkedlist.LinkedListIterator;

public class Main {
    public static void main(String[] args) {
	    LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomon");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            //
        }
    }
}
