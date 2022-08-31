package Chapter8.Bank;

import Bank.Account;
import Bank.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account;

    @BeforeEach
    void setUp() {
        Customer customer = new Customer("ace", "black", "male",
                23, "09087654523", "ace@gmail.com", "lagos");
        //account = new Account(customer);
        assertNotNull(customer);
    }

    @Test
    void testThatAccountCanBeCreatedUsingCustomersDetails(){
       // account.getAccountNumber();
        //System.out.println(account.getAccountNumber());
        //assertNotNull(account);

    }

    @Test
    void testThatAccountCanBeCredited(){
        account.deposit(10000);
    assertEquals(10000, account.getBalance());
    }

    @Test
    void testThatAccountCanBeDebited(){
        account.deposit(25000);
        account.withdraw(2500);
    assertEquals(22500, account.getBalance());
    }

//    @Test
//    void testThatAccountCanMakeTransfer(){
//        account.deposit(25000);
//        account.withdraw(2500);
//        Account account1 = new Account(new Customer("ac","e","male",23,
//                "898","tyufuyf","epe"));
//        account1.acceptTransfer(2500);
//    }

    @Test
    void testThatWeCanGetAccountNumber() {
        assertEquals("3081305215", account.getAccountNumber());
    }

    @Test
    void testThatWeCanHaveASavingAccount(){
        assertTrue(account.isSavings());
    }

    @Test
    void testThatWeCanHaveACurrentAccount(){
        assertTrue(account.isCurrent());
    }
}
