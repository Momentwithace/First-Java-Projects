package tdd;

import org.junit.jupiter.api.Test;
import tdd.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int results = calculator.add(6,2);
        assertEquals(8, results);

    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int results = calculator.subtract(4,2);

    }

    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int results = calculator.subtractTest(2, 4);
        assertEquals(2, results);

    }

    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int results = calculator.productTest(5,5);
        assertEquals(25, results);

    }

    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int results = calculator.qoutientTest(5,2);
        assertEquals(2, results);

    }

    @Test
    public void quotientTest2(){
        Kata calculator = new Kata();
        int results = calculator.qoutientTest2(10 , 0);
        assertEquals(0, results);


    }

    @Test
    public void result(){
        Kata result = new Kata();
        String gradeA = result.grade(92);
        String gradeB = result.grade(85);
        String gradeC = result.grade(73);
        String gradeD = result.grade(65);
        String gradeF = result.grade(26);
        assertEquals("A" , gradeA);
        assertEquals("B" , gradeB);
        assertEquals("C" , gradeC);
        assertEquals("D" , gradeD);
        assertEquals("F" , gradeF);



    }
////    @Test
////    public void primeNumberTest(){
////        boolean isPrime = Kata.isPrime(5);
////            assertTrue(isPrime);
//        }
        @Test
    public void noOfFactors(){
        Kata calc = new Kata();
        int factor = calc.noOfFactors(5);
        assertEquals(2,factor);
        }
    }


