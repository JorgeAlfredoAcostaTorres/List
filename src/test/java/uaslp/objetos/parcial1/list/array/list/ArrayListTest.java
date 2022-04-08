package uaslp.objetos.parcial1.list.array.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.parcial1.list.Iterator;
import uaslp.objetos.parcial1.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.parcial1.list.exception.NotValidIndexException;

public class ArrayListTest {
    //INICIALIZACIÓN / PREPARACIÓN
    //EJECUCIÓN --> Llamar al método probado
    //VALIDACIÓN

    //TDD --> Test Driven Development

    @Test
    public void givenANewList_whenGetSize_thenResultIsZero() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        int sizeOfList = list.getSize();

        //Then
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenIncreaseArraySize_thenResultIsFour() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>(3);

        list.addAtFront("Hola");
        list.addAtTail("a");
        list.addAtTail("todos");

        //When
        list.addAtTail("y todas");
        int sizeOfList = list.getSize();

        //Then
        Assertions.assertEquals(4, sizeOfList, "Size must be four after increasing");
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("a", list.getAt(1));
        Assertions.assertEquals("todos", list.getAt(2));
        Assertions.assertEquals("y todas", list.getAt(3));
    }

    @Test
    public void givenANewList_whenIncreaseArraySizeWithAddAtFront_thenResultIsFour() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>(3);

        list.addAtFront("Hola");
        list.addAtTail("a");
        list.addAtTail("todos");

        //When
        list.addAtFront("y todas");
        int sizeOfList = list.getSize();

        //Then
        Assertions.assertEquals(4, sizeOfList, "Size must be four after increasing");
        Assertions.assertEquals("y todas", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
        Assertions.assertEquals("a", list.getAt(2));
        Assertions.assertEquals("todos", list.getAt(3));
    }

    @Test
    public void givenANewListWithSize_whenGetSize_thenResultIsSize() {
        //Given
        ArrayList<String> list = new ArrayList<>(10);

        //When
        int sizeOfList = list.getSize();

        //Then
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero because there are not elements");
    }

    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown() {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        try {
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
        } catch (NotValidIndexException ex) {
            //Exception thrown
        }

        //Then
    }

    @Test
    public void givenAListWithElement_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When
        list.addAtFront("Mundo");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
        Assertions.assertEquals("Hola", list.getAt(1));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        //When
        list.addAtTail("Hola");

        //Then
        Assertions.assertEquals(1, list.getSize());
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAListWithElement_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hola");

        //When
        list.addAtTail("Mundo");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenANewListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        //When
        list.remove(0);

        //Then
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex_thenNotValidIndexExceptionsIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When

        //Then
        Assertions.assertThrows(NotValidIndexException.class, () -> list.remove(3));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenNotValidExceptionsIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When

        //Then
        Assertions.assertThrows(NotValidIndexException.class, () -> list.setAt(3, "Valor"));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When

        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.addAtFront(null));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When

        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When

        //Then
        Assertions.assertThrows(NotNullValuesAllowedException.class, () -> list.setAt(0, null));
    }

    @Test
    public void givenANewListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        list.remove(0);

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Mundo", list.getAt(0));
    }

    @Test
    public void givenANewListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");
        list.addAtTail("Mundo");

        //When
        list.remove(1);

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenANewListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adiós");

        //When
        list.remove(1);

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adiós", list.getAt(0));
        Assertions.assertEquals("Cruel", list.getAt(1));
    }

    @Test
    public void givenANewListWith3Elements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adiós");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When
        list.remove(2);

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Adiós", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenANewListWith3Elements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adiós");

        //When
        list.removeAll();

        //Then
        int size = list.getSize();

        Assertions.assertEquals(0, size);
    }

    @Test
    public void givenANewListWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adiós");

        //When
        list.setAt(0, "Hola");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenANewListWith3Elements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Adiós");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");

        //When
        Iterator<String> iterator = list.getIterator();

        //Then
        int size = list.getSize();

        Assertions.assertEquals(3, size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adiós", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}
