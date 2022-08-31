package MyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    List list;

    @BeforeEach
    void SetUp(){
        list = new ArrayList();
    }

    @Test
    void isEmpty(){
        assertTrue(list.isEmpty());
    }

    @Test
    void add(){
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addMoreItem(){
        list.add("G-String");
        list.remove("G-String");
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_sizeIncrease(){
        list.add("G-String");
        assertEquals(1, list.size());
    }

    @Test
    void addAnotherItem_sizeIncrease(){
        list.add("G-String");
        list.add("F-String");
        assertEquals(2, list.size());
    }

    @Test
    void add_remove(){
        list.add("G-String");
        list.add("F-String");
        list.add("L-String");
        list.remove("G-String");
        assertEquals(2, list.size());
        assertEquals("F-String", list.get(0));
        assertEquals("L-String", list.get(1));
        assertFalse(list.isEmpty());
    }

    @Test
    void retrieveItem(){
        list.add("G-String");
        list.add("E-String");
        assertEquals("G-String", list.get(0));
    }

    @Test
    void addTwo(){
        list.add("G-String");
        list.add("E-String");
        assertEquals("E-String", list.get(1));
    }

    @Test
    void addTwo2(){
        list.add("G-String");
        list.add("E-String");
        assertEquals("G-String", list.get(0));
    }

    @Test
    void listShift(){
        list.add("G-String");
        list.add("E-String");
        list.add("Y-String");

        list.remove("G-String");
        list.remove("E-String");
        assertEquals("Y-String", list.get(0));
    }

    @Test
    void listShift3(){
        list.add("G-String");
        list.add("E-String");
        list.add("Y-String");

        list.remove("E-String");
        assertEquals("Y-String", list.get(1));
        assertNull(list.get(2));
    }

    @Test
    void add6Element(){
        assertEquals(5, list.capacity());
        list.add("G-String");
        list.add("E-String");
        list.add("Y-String");
        list.add("T-String");
        list.add("F-String");
        list.add("A-String");
        list.add("N-String");

        assertEquals(10,list.capacity());

    }
}
