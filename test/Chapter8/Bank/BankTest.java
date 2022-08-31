package Chapter8.Bank;

import Bank.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    Bank bank;
    @BeforeEach
    void setUp(){
         bank = new Bank("Gtb", "314, Sabo Yaba", "2347040859510");
    }

    @Test
    void testThatWeHaveABank(){
       assertNotNull(bank);
    }
//
//    @Test
//    void testThatABankCanAddACustomer(){
//        Customer customer = new Customer("ace", "black", "male", 23,
//                "090765787654", "ace@gamil.ymail", "lagos");
//        bank.addCustomer(customer.getAccountNumber());
//        System.out.println(customer);
//       // assertEquals("3081305211", bank.getCustomer());
//    }

//    @Test
//    void testThatBankCanAddACustomer(){
//        Account account = new Account(new Customer("Ace", "Black", "Male",
//                23, "09023541243", "ace@gmail.com", "lagos" ));
//        bank.addAccount(account);
//
//        assertEquals(1, bank.getAccount("3081305211", ));
//    }

//    @Test
//    void testThatABankCanHaveACustomer(){
//
////        Customer customer = new Customer("Zeddy", "Ac", "Male", 21,
////                "08060542314", "zeddy@gmail.com", "Lagos State");
//        Account account = new Account("Ace", "boy", "male", 34,
//                "09045615456", "fgfhv", "tdfghg");
//       bank.addCustomer();
//        System.out.println(customer.getAccountNumber());
////        Account account = new Account("ace", "paul", "male", 21,
////                "090868677726", "ace@gmail.com", "lagos");
//        Account account2 = new Account("acee", "pauel", "male", 21,
//                "090868677726", "ace@gmail.com", "lagos");
//        System.out.println(account2.getAccountNumber());
//        System.out.println(account.getAccountNumber());
//        System.out.println(customer.getAccountNumber());
       // bank.addCustomers(account);
        //System.out.println(account.getAccountNumber());
//        Customer customer1 = new Customer("Elon", "Mac", "Male", 31,
//                "08060545314", "zeddy@gmail.com", "Lagos State");
//        bank.addCustomer(customer1);
       // assertEquals(1, bank.getCustomerList());
   // }

//    void testThatBankCanGetASingleCustomer(){
//        Customer customer = new Customer("Zeddy", "Ac", "Male", 21,
//                "08060542314", "zeddy@gmail.com", "Lagos State");
//        bank.addCustomer(customer);
//        Customer customer1 = new Customer("Elon", "Mac", "Male", 31,
//                "08060545314", "zeddy@gmail.com", "Lagos State");
//        bank.addCustomer(customer1);
//        //bank.getCustomer(customer)
//    }


}
