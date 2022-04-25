package airCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void airConditionCanBeSetOnTest() {
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it on
        hisense.setOn(true);
        //check that it is on
        assertEquals(true, hisense.checkSetOn());

    }

    @Test
    public void airConditionCanBeSetOffTest() {
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //given that my airCondition is on
        hisense.setOn(true);
        //when i turn it off
        hisense.setOn(false);
        //check that it is off
        assertEquals(false, hisense.checkSetOn());

    }

    @Test
    public void airConditionCanIncreaseTemperatureTest() {
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it on
        hisense.setOn(true);
        //when my initial temperature is
        hisense.setTemperature(16);
        //when i increase the temperature
        hisense.increaseTemperature(2);
        //check that the temperature increases
        assertEquals(18, hisense.getTemperature());

    }


    @Test
    public void airConditionCanBeDecreaseTemperatureTest2() {
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //when i set it on
        hisense.setOn(true);
        //when my initial temperature is
        hisense.setTemperature(18);
        //when i decrease the temperature
        hisense.decreaseTemperature(1);
        //check that the temperature decreases
        assertEquals(17 , hisense.getTemperature());

    }

    @Test
    public void airConditionCanBeIncreaseBeyond30Test(){
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //given that is it set on
        hisense.setOn(true);
        //when i increase temperature beyond 30
        hisense.increaseTemperatureBeyond(30);
        //check that the temperature is till 30
        assertEquals(30 , hisense.getTemperature());

    }

    @Test
    public void airConditionCanBeDecreaseBelow16Test(){
        //given that i have an airCondition
        AirCondition hisense = new AirCondition();
        //given that i set it on
        hisense.setOn(true);
        //when i decrease the temperature below 16
        hisense.decreaseTemperatureBelow16(16);
        //check that the temperature is 16
        assertEquals(16 , hisense.getTemperature());


    }
}