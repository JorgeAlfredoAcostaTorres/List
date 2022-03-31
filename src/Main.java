import uaslp.objetos.parcial1.list.Iterator;
import uaslp.objetos.parcial1.list.List;
import uaslp.objetos.parcial1.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;
import uaslp.objetos.parcial1.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("With ArrayList");
        try {
            newMetodo(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } */

        System.out.println("With LinkedList");
        try {
            newMetodo(new LinkedList<>(), new LinkedList<>(), new LinkedList<>());
        } catch (NotValidIndexException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NotNullValuesAllowedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("El programa no ha fallado");
    }

    public static void newMetodo(List<String> team1, List<String> team2, List<String> team3) throws NotValidIndexException, NotNullValuesAllowedException {
        //team1.remove(5);
        team1.addAtTail(null);

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        Iterator<String> iterator;

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
        System.out.println("Team 1 tiene:" + team1.getSize() + " integrantes"); //Debe imprimir "Team 1 tiene 3 integrantes"

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
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes"); //Debe imprimir "Team 2 tiene 3 integrantes"

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

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes"); //Debe imprimir "Team 3 tiene 2 integrantes"

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

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes"); //Debe imprimir "Team 1 tiene 3 integrantes"

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
