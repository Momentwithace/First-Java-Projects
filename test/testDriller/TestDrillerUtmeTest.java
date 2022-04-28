package testDriller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerUtmeTest {
    @Test
    public void TestDrillerTest1(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(3);
        assertEquals(6000, pricePerUnit );

    }

    @Test
    public void TestDrillerTest2(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(7);
        assertEquals(12600, pricePerUnit );

    }

    @Test
    public void TestDrillerTest3(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(13);
        assertEquals(20800, pricePerUnit );

    }

    @Test
    public void TestDrillerTest4(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(33);
        assertEquals(49500, pricePerUnit );

    }

    @Test
    public void TestDrillerTest5(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(53);
        assertEquals(68900, pricePerUnit );

    }

    @Test
    public void TestDrillerTest6(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(110);
        assertEquals(132000, pricePerUnit );

    }

    @Test
    public void TestDrillerTest7(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(250);
        assertEquals(275000, pricePerUnit );

    }

    @Test
    public void TestDrillerTest8(){
        TestDrillerUtme ace = new TestDrillerUtme();
        int pricePerUnit = ace.numberOfCopies(6000);
        assertEquals(6000000, pricePerUnit );

    }

}
