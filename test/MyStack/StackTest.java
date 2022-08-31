package MyStack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack myStack;

    @BeforeEach
    void setUp(){
        myStack = new Stack();
    }

    @Test
    void testThatMyStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    void testThatWeCanAddElementToMyStack(){
        myStack.push("Ace");
        assertEquals(1, myStack.size());
    }

    @Test
    void testThatElementCanBeRemoveFromMyStack(){
        myStack.push("Ace");
        myStack.push("Joe");
        myStack.push("Rollins");
        myStack.pop("Rollins");
        assertEquals(2,myStack.size());
    }

    @Test
    void testThatICanPeeKElementFromMyStack() {
        myStack.push("Ace");
        myStack.push("Joe");
        myStack.push("Rollins");
        assertEquals("Rollins", myStack.peek());
    }

    @Test
    void testThatWeCanSearchForAnElementInMyStack(){
        myStack.push("Ace");
        myStack.push("Joe");
        myStack.push("Rollins");
        assertTrue(myStack.search(0));
    }
}
