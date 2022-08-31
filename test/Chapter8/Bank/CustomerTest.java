package Chapter8.Bank;

import Bank.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {
    Customer customer;
    @BeforeEach
    void setUp(){
         customer = new Customer("Ace", "Sandra", "Male", 23,
                "09035122224", "ace@gmail.com", "Lagos State");
    }

    @Test
    void testThatCustomerHasBeenCreated(){
        assertNotNull(customer);
    }

    @Test
    void testThatWeCanGetCustomersFirstName(){
        assertEquals("Ace", customer.getFirstName());
    }

    @Test
    void testThatWeCanGetCustomersLastName(){
        assertEquals("Sandra", customer.getSecondName());
    }

    @Test
    void testThatWeCanGetCustomersGender(){
        assertEquals("Male", customer.getGender());
    }

    @Test
    void testThatWeCanGetCustomersAge(){
        assertEquals(23, customer.getAge());
    }

    @Test
    void testThatWeCanGetCustomersEmail(){
        assertEquals("ace@gmail.com", customer.getEmail());
    }

    @Test
    void testThatWeCanGetCustomersPhoneNumber(){
        assertEquals("09035122224", customer.getPhoneNumber());
    }

    @Test
    void testThatWeCanGetCustomersStateOfOrigin(){
        assertEquals("Lagos State", customer.getStateOfOrigin());
    }

}
