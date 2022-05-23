package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;
    @BeforeEach
    void setUp() {
        product =new Product();
    }

    @AfterEach
    void tearDown() {

    }
    @Test
    void testThatTheUserCanEnterProductName(){
        product.setProductName("bible");
        assertEquals("bible", product.getProductName());
    }
    @Test
    void testThatTheUserCanEnterProductUnit(){
        product.setProductUnit(1);
        assertEquals(1, product.getProductUnit());
    }
    @Test
    void testThatWeCanHavePricePerUnit(){
        product.setPricePerUnit(500.11);
        assertEquals(500.11, product.getPricePerUnit());

    }
    @Test
    void testThatWeCanCalculatePriceOnEachProduct(){
        product.setProductUnit(2);
        product.setPricePerUnit(500.11);
        assertEquals(1000.22, product.getPriceOnEachProduct());

    }
}