package Regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {

    @Test
    public void testThatWeCanValidatePhoneNumber(){
        assertTrue(Regex.validatePhoneNumber("+2349035122224"));
    }

    @Test
    public void testThatPhoneNumberIsValidWithZero(){
        assertFalse(Regex.validatePhoneNumber("+23409035122224"));
    }

    @Test
    public void testThatPhoneNumberIsValidWithOutCountry(){
        assertTrue(Regex.validatePhoneNumber("09035122224"));
    }

    @Test
    public void testThatWeCanValidateEmail(){
        assertTrue(Regex.validateEmail("momentwithace@gmail.com"));
    }

    @Test
    public void testThatEmailWithNumberIsValid(){
        assertTrue(Regex.validateEmail("momentwithace28@gmail.com"));
    }

    @Test
    public void testThatEmailWithNumberInBetweenIsValid(){
        assertTrue(Regex.validateEmail("moment12withace@gmail.com"));
    }

    @Test
    public void testThatEmailWithNumberInBetweenAndAtTheEndIsValid(){
        assertTrue(Regex.validateEmail("moment12withace7643@gmail.com"));
    }

    @Test
    public void testThatEmailWithNumberAtTheBeginningIsValid(){
        assertFalse(Regex.validateEmail("7654momentwithace@gmail.com"));
    }

    @Test
    public void testThatEmailWithIdIsInvalid(){
        assertFalse(Regex.validateEmail("@gmail.com"));
    }

    @Test
    public void testThatEmailWithDifferentDomainNameIsValid(){
        assertTrue(Regex.validateEmail("momentwithace@yahoo.com"));
        assertTrue(Regex.validateEmail("momentwithace@ymail.com"));
        assertTrue(Regex.validateEmail("momentwithace@gmail.com"));
        assertTrue(Regex.validateEmail("momentwithace@ace.com"));

    }

    @Test
    public void testThatWeCanValidatePassword(){
        assertTrue(Regex.validatePassword("Semicolon@3"));
    }

    @Test
    public void testThatPasswordWithOutSpecialCharacterIsNotValid(){
        assertFalse(Regex.validatePassword("Semicolon"));
    }

    @Test
    public void testThatPasswordCanStartAndEndWithNumber(){
        assertTrue(Regex.validatePassword("12Ami@&Thcolon@12"));
    }

    @Test
    public void testThatPasswordWithNumberOrSpecialCharacterInBetweenIsValid(){
        assertTrue(Regex.validatePassword("Semicolon@3Av"));
    }

    @Test
    public void testThatFirstNameCanBeValidated(){
        assertTrue(Regex.ValidateFirstName("Momentwithace"));
    }

    @Test
    public void testThatLastNameCanBeValidated(){
        assertTrue(Regex.ValidateLastName("Unlikeace"));
    }

}