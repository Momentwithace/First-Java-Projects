package TurtleGraphicsTest;


import Chapter7.TurtleGraphics.Direction;
import Chapter7.TurtleGraphics.Position;
import Chapter7.TurtleGraphics.Turtle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle turtle;

    @BeforeEach
    void setUp(){
        turtle = new Turtle();
    }

    @Test
    void testThatWeHaveATurtle(){
        assertNotNull(turtle);
    }

    @Test
    void testThatPenIsUpByDefault(){
        assertTrue(turtle.isPenUp());
    }

    @Test
    void testThatPenCanMoveDown(){
        turtle.penIsDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void testThatCanMoveUpAgain(){
        turtle.penIsDown();
        assertFalse(turtle.isPenUp());
        turtle.penCanBeUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    void whenFacingEast_TurtleCanTurnRight(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    void whenFacingEast_TurtleCanTurnLeft(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.getCurrentDirection());

        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turnCanMoveForwardFacingEastTest(){
        assertSame(Direction.EAST, turtle.getCurrentDirection());
        turtle.move(5);

        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }


}

