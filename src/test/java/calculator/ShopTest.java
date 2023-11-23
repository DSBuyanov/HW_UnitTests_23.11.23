
package calculator;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    private Shop shop;
    private List<Product> products;

    @BeforeEach
    void setUp() {
        products = Arrays.asList(
            new Product("Product A", 10.0),
            new Product("Product B", 20.0),
            new Product("Product C", 30.0)
        );
        shop = new Shop(products);
    }

    @Test
    void sortProductsByPrice() {
        shop.sortProductsByPrice();
        Assertions.assertEquals(10.0, shop.getProducts().get(0).getPrice());
        assertEquals(20.0, shop.getProducts().get(1).getPrice());
        assertEquals(30.0, shop.getProducts().get(2).getPrice());
    }

    @Test
    void getMostExpensiveProduct() {
        Assertions.assertEquals(30.0, shop.getMostExpensiveProduct().getPrice());
    }
}
