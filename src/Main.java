import uaslp.objetos.parcial1.list.array.list.ArrayListIterator;
import uaslp.objetos.parcial1.list.linkedlist.LinkedList;
import uaslp.objetos.parcial1.list.linkedlist.LinkedListIterator;
import uaslp.objetos.parcial1.list.array.list.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList team1 = new ArrayList();
        ArrayList team2 = new ArrayList();
        ArrayList team3 = new ArrayList();

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        ArrayListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Jesús
        // Salomón
        // Yael

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Diego
        //Daniel
        //Cristian

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("Team 1 tiene:" + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Rebeca
        //Salomón
        //Yael

        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Diego
        //Daniel
        //Rita

        team3.remove(0);
        team3.remove(0); //No debe cerrarse el programa aunque no exista el elemento

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Isai
        //Tadeo

        if(team1.getAt(1).equals("Salomón")) {
            team1.setAt(1, "Luis");
        }

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Rebeca
        //Luis
        //Yael
    }

    public static void mainLinkedList(String[] args) {
	    LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        LinkedListIterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Debió haber impreso
        // Jesús
        // Salomón
        // Yael

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Diego
        //Daniel
        //Cristian

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("Team 1 tiene:" + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Rebeca
        //Salomón
        //Yael

        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");

        iterator = team2.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Diego
        //Daniel
        //Rita

        team3.remove(0);
        team3.remove(0); //No debe cerrarse el programa aunque no exista el elemento

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");

        iterator = team3.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Isai
        //Tadeo

        if(team1.getAt(1).equals("Salomón")) {
            team1.setAt(1, "Luis");
        }

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");

        iterator = team1.getIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        //Debió haber impreso
        //Rebeca
        //Luis
        //Yael
    }
}
