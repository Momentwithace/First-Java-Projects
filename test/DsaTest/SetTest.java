package DsaTest;

import DSA.HashSet;
import DSA.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @BeforeEach
    void setUp() {
        set = new HashSet();
    }

    @Test
    void isEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    void add() {
        set.add("Ace");
        assertFalse(set.isEmpty());
    }

    @Test
    void remove(){
        set.add("Ace");
        set.remove("Ace");
        assertTrue(set.isEmpty());
    }

    @Test
    void contains(){
        set.add("Ace");
        set.add("Wale");
        assertTrue(set.itContain("Ace"));
    }

    @Test
    void addAnotherItem_sizeIncrease(){
        set.add("Ace");
        set.add("Vee");
        assertEquals(2, set.size());
    }
}