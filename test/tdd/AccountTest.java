package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void accountCanBeCreatedTest() {
        //given i have created an account
        Account nepaAccount = new Account();
        //when i check my balance
        int balance = nepaAccount.getBalance();
        //confirm that my balance is zero
        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        //given that i have an account
        Account boyoAccount = new Account();
        //when i deposit money
        boyoAccount.deposit(1_500);
        //check that my balance has changed
        assertEquals(1500, boyoAccount.getBalance());
    }

    @Test
    public void depositTwiceTest() {
        Account useLessAccount = new Account();
        useLessAccount.deposit(1_500);
        useLessAccount.deposit(2_000);
        assertEquals(3_500, useLessAccount.getBalance());
    }


    @Test
    public void withdraw() {
        //given i have an account
        Account aceAccount = new Account();
        //when i make deposit
        aceAccount.deposit(2000);
        //when i check my balance
        aceAccount.getBalance();
        assertEquals(2000, aceAccount.getBalance());


    }

    @Test
    @DisplayName("withdrawNegativeValueShouldNotChangeBalance")
    public void withdrawNegativeValueShouldNotChangeBalance(){
        //given i have an account
        Account aceAccount = new Account();
        //when i withdraw negative amount
        aceAccount.withdraw(-2000);
        //my balance should not change
        assertEquals(0, aceAccount.getBalance());






    }

    @Test
    public void withdrawExcess(){
        //given that i have an account
        Account aceAccount = new Account();
        //when i withdraw excess
        aceAccount.withdraw(2000);
        //my account should not change
        assertEquals(0,aceAccount.getBalance());






    }

}
