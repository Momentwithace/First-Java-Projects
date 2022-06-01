package Chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {
    RectangleClass ace;

    @BeforeEach
    void setUp() {
    ace = new RectangleClass();
    }

    @Test
    void testValueOfLengthAndWidth(){
        ace.setLength(2.0);
        ace.setWidth(3.0);
        double length = ace.getLength();
        double width = ace.getWidth();
        assertEquals(2.0, length);
        assertEquals(3.0, width);
    }

    @Test
    void testPerimeterCalculator(){
        ace.setLength(2.0);
        ace.setWidth(3.0);
        double perimeter =  ace.perimeterCalculator();
        assertEquals(10, perimeter );
    }

    @Test
    void testAreaCalculator(){
        ace.setLength(2.0);
        ace.setWidth(3.0);
        double area =  ace.areaCalculator();
        assertEquals(6, area);
    }
}