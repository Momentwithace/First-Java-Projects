package bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void BikeCanBeOnTest() {
        //given that i have a bike
        Bike tvs = new Bike();
        //when i turn it on
        tvs.setOn(true);
        //check that the bike is on
        assertEquals(true, tvs.checkSetOn());


    }

    @Test
    public void BikeCanBeOffTest(){
     //given that i have a bike
        Bike tvs = new Bike();
     //given that the bike is on
        tvs.isSetOn(true);
     //when i turn the bike off
        tvs.setOff(true);
     //check that the bike is off
        assertEquals(true, tvs.checkSetOff());



    }


}
