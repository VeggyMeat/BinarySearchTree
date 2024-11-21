import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalArrayTest {
    @Test
    void testConstructor0() {
        FunctionalArray array = new FunctionalArray(0);
        assertNotNull(array);
    }

    @Test
    void testConstructorArraySize() {
        FunctionalArray array = new FunctionalArray(5);
        assertNotNull(array);
    }

    @Test
    void testSetGetAll() {
        FunctionalArray array = new FunctionalArray(5);
        array.set(0, 9);
        array.set(1, 3);
        array.set(2, 8);
        array.set(3, 4);
        array.set(4, 4);

        assertEquals(9, array.get(0));
        assertEquals(3, array.get(1));
        assertEquals(8, array.get(2));
        assertEquals(4, array.get(3));
        assertEquals(4, array.get(4));
    }

    @Test
    void testSetOutOfBoundsException1() {
        FunctionalArray array = new FunctionalArray(1);
        assertThrows(IndexOutOfBoundsException.class, () -> array.set(1, 1));
    }

    @Test
    void testSetOutOfBoundsException2() {
        FunctionalArray array = new FunctionalArray(5);
        assertThrows(IndexOutOfBoundsException.class, () -> array.set(-1, 1));
    }

    @Test
    void testGetOutOfBoundsException1() {
        FunctionalArray array = new FunctionalArray(5);
        assertThrows(IndexOutOfBoundsException.class, () -> array.get(5));
    }
    @Test
    void testGetOutOfBoundsException2() {
        FunctionalArray array = new FunctionalArray(5);
        assertThrows(IndexOutOfBoundsException.class, () -> array.set(-1, 1));
    }
}