package airCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void airConditionCanBeSetOnTest(){
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it on
        hisense.setOn(true);
        //check that it is on
        assertEquals(true, hisense.checkSetOn());

    }

    @Test
    public void airConditionCanBeSetOffTest(){
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it off
        hisense.setOn(false);
        //check that it is off
        assertEquals(false,hisense.checkSetOn());

    }

    @Test
    public void airConditionCanIncreaseTemperatureTest(){
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it on
        hisense.setOn(true);
        //when my initial temperature is
        hisense.setTemperature(16);
        //when i increase the temperature
        hisense.setTemperature(30);
        //check that the temperature increases
        assertEquals(30, hisense.getTemperature());

    }

    @Test
    public void airCondtionCanBeDecreaseTemperatureTest(){
        //given that i have an airCondition
        //AirCondition
        //when i set it on
        //when my initial temperature is
        //when i decrease the temperature
        //check that the temperature decreases






    }
}
