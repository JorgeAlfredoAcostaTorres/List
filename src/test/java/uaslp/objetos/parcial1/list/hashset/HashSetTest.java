package uaslp.objetos.parcial1.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.parcial1.list.Iterator;
import uaslp.objetos.parcial1.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.parcial1.list.exception.NotSuchElementException;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;
import uaslp.objetos.parcial1.list.linkedlist.LinkedList;

public class HashSetTest {
    @Test
    public void givenANewHashSet_WhenCreateANewList_thenResultIsZero() {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When
        int sizeOfList = hashSet.size();

        //Then
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewHashSet_WhenAddAnElement_thenResultIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When
        hashSet.add("Hola");

        //Then
        int sizeOfList = hashSet.size();

        Assertions.assertEquals(1, sizeOfList, "Size of list after add element must be one");
    }

    @Test
    public void givenANewHashSet_WhenAddARepeatElement_thenResultIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hola");

        //When
        hashSet.add("Hola");

        //Then
        int sizeOfList = hashSet.size();

        Assertions.assertEquals(1, sizeOfList, "Size of list after add element must be one");
    }

    @Test
    public void givenAHashSetWithOneElement_WhenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hola");

        //When
        hashSet.remove("Hola");

        int sizeOfList = hashSet.size();

        //Then
        Assertions.assertEquals(0, sizeOfList, "Size of list after remove element must be zero");
    }

    @Test
    public void givenAHashSetWithOneElement_WhenContains_thenResultIsTrue() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hola");

        //When
        hashSet.contains("Hola");

        int sizeOfList = hashSet.size();

        //Then
        Assertions.assertEquals(1, sizeOfList, "Size of list after contains must be one");
    }

    @Test
    public void givenAHashSetWithOneElement_WhenContainsNull_thenResultIsFalse() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hola");

        //When
        hashSet.contains("null");

        int sizeOfList = hashSet.size();

        //Then
        Assertions.assertEquals(1, sizeOfList, "Size of list after contains must be one");
    }

    @Test
    public void givenAHashSet_WhenIterator_thenNewHashSetIterator() {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When

        //Then
        hashSet.iterator();
    }

    @Test
    public void givenAHashSet_WhenHashSetIteratorHasNext_thenHashSetIterator() {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When

        //Then
        hashSet.iterator().hasNext();
    }

    @Test
    public void givenAHashSet_WhenHashSetIteratorNext_thenHashSetIterator() throws NotValidIndexException, NotSuchElementException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        //When

        //Then
        hashSet.iterator().next();
    }

    /* @Test
    public void givenAHashSetWithElements_WhenReorganize_thenResultIsSix() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Hola");
        hashSet.add("todos");
        hashSet.add("a");
        hashSet.add("y");
        hashSet.add("todas");

        //When
        hashSet.add("ustedes");

        //Then
        int sizeOfList = hashSet.size();

        Assertions.assertEquals(6, sizeOfList, "Size of list after add element must be five");
    } */
}
