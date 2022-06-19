package Chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringComparisonTest {
    StringComparison array;

    @BeforeEach
    void setUp() {
       array = new StringComparison();
    }
    @Test
    void testThatComparisonIsFalse(){
        String[] Ace = new String[5];
        String[] Ace2 = new String[3];
        assertFalse(array.comparisonResult(Ace, Ace2));
    }
    @Test
    void testThatComparisonIsTrue(){
        String[] Ace = new String[3];
        String[] Ace2 = new String[3];
        assertTrue(array.comparisonResult(Ace, Ace2));
    }
    @Test
    void testThatTwoDifferentArrayContainTheSameStringElement(){
        String[] Ace = new String[5];
        String[] Ace2 = new String[2];
        assertFalse(array.StringArrayElementComparison(Ace, Ace2));

    }

}