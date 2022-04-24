package bikeProject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void BikeCanBeSetOn() {
        //given that i have a bike
        Bike tvs = new Bike();
        //when i set the bike on
        tvs.setOn(true);
        //check that the bike is on
        assertEquals(true, tvs.checkSetOn());
    }

    @Test
    public void BikeCanBeSetOff(){
        //given that i have a bike
        Bike tvs = new Bike();
        //given that the bike is on
        tvs.setOn(false);
        //check that the bike is off
        assertEquals(false, tvs.checkSetOn());

    }

    @Test
    public void BikeGearTest(){
        //given that i have a bike
        Bike tvs = new Bike();
        //given that i have gear
        tvs.setGear(1);
        //when i accelerate
        tvs.setGear(2);
        //check that my speed increase
        assertEquals(2, tvs.checkGear());

    }

    @Test
    public void BikeCanAccelerate(){
        //given that i have a bike
        Bike tvs = new Bike();
        //when i change gear
        tvs.setGear(1);
        //my initial speed
        tvs.setSpeed(19);
        //check that my bike can accelerate
        tvs.setAccelerator(true);
        //confirm that my speed as increased
        assertEquals(20, tvs.getSpeed());

    }

    @Test
    public void BikeCanAccelerateOnGear2(){
        //given that i have a bike
        Bike tvs = new Bike();
        //when i set my gear
        tvs.setGear(2);
        //my initial speed
        tvs.setSpeed(21);
        //check that my bike can accelerate
        tvs.setAccelerator(true);
        //check that my bike can accelerate with gear 1
        assertEquals(23, tvs.getSpeed());

    }

    @Test
    public void BikeCanAccelerateOnGear3(){
        //given that i have a bike
        Bike tvs = new Bike();
        //when i set my gear
        tvs.setGear(3);
        //my initial speed
        tvs.setSpeed(31);
        //check that my bike can accelerate
        tvs.setAccelerator(true);
        //check that my bike can accelerate with gear 3
        assertEquals(34, tvs.getSpeed());

    }

    @Test
    public void BikeCanAccelerateOnGear4(){
        //given that i have a bike
        Bike tvs = new Bike();
        //when i set my gear
        tvs.setGear(4);
        //my initial speed
        tvs.setSpeed(41);
        //check that my bike can accelerate
        tvs.setAccelerator(true);
        //check that my bike can accelerate on gear 4
        assertEquals(45, tvs.getSpeed());

    }

    @Test
    public void BikeCanBeDecceleratedTest() {
        //given that i have a bike
        Bike tvs = new Bike();
        //given that i can set gear
        tvs.setGear(1);
        //my initial speed
        tvs.setSpeed(20);
        //check that my back can deccelerate
        tvs.setDeccelerator(true);
        //confirm that my bike can deccelerate
        assertEquals(19, tvs.getSpeed());
    }

    @Test
    public void BikeCanBeDecceleratedTest2() {
            //given that i have a bike
            Bike tvs = new Bike();
            //given that i set my gear
            tvs.setGear(2);
            //when my initial speed is
            tvs.setSpeed(30);
            //check that my bike can deccelerate
            tvs.setDeccelerator(true);
            //confirm that my bike can deccelerate
            assertEquals(28, tvs.getSpeed());

    }


    @Test
    public void BikeCanBeDecceleratedTest3(){
        //given that i have a bike
        Bike tvs = new Bike();
        //given that i set my gear
        tvs.setGear(3);
        //when my initial speed is
        tvs.setSpeed(40);
        //check that my bike can deccelerate
        tvs.setDeccelerator(true);
        //confirm that my bike can deccelerate
        assertEquals(37, tvs.getSpeed());

    }

    @Test
    public void BikeCanBeDeccelerratedTest4(){
        //given that i have a bike
        Bike tvs = new Bike();
        //given that i set my gear
        tvs.setGear(4);
        //when my initial speed is
        tvs.setSpeed(50);
        //check that my bike can deccelerate
        tvs.setDeccelerator(true);
        //confirm that my bike can deccelerate
        assertEquals(46, tvs.getSpeed());

    }

}