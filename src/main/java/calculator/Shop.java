
package calculator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void sortProductsByPrice() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(products, Comparator.comparingDouble(Product::getPrice));
    }

    public List<Product> getProducts() {
        return products;
    }
}
