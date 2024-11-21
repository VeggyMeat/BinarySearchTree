import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchSetTest {
    @Test
    void testConstructor() {
        SearchSet set = new SearchSet();
        assertNotNull(set);
    }

    @Test
    void testContainsWithZero() {
        SearchSet set = new SearchSet();
        assertFalse(set.contains(1));
    }

    @Test
    void testContainsWithMany() {
        SearchSet set = new SearchSet();
        set.insert(7);
        set.insert(2);
        set.insert(12);
        set.insert(5);

        assertTrue(set.contains(7));
        assertTrue(set.contains(2));
        assertTrue(set.contains(12));
        assertTrue(set.contains(5));
    }

    @Test
    void testElementsWithZero() {
        SearchSet set = new SearchSet();
        assertEquals(0, set.getNumberElements());
    }

    @Test
    void testElementsWithOne() {
        SearchSet set = new SearchSet();
        set.insert(1);
        assertEquals(1, set.getNumberElements());
    }

    @Test
    void testElementsWithFew() {
        SearchSet set = new SearchSet();
        set.insert(1);
        set.insert(2);
        set.insert(7);
        set.insert(-5);
        assertEquals(4, set.getNumberElements());
    }

    @Test
    void testInsertAlreadyThere() {
        SearchSet set = new SearchSet();
        set.insert(1);
        assertThrows(IllegalArgumentException.class, () -> set.insert(1));
    }
}