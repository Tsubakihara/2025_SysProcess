// ファイル名: ProductValidationTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Productクラスは以下のようなイメージです。
// class Product { 
//     private String name; 
//     private int price; 
//     boolean isValid() { return !name.isEmpty() && price > 0; }
//     /* setter/getter省略 */ 
// }

class ProductValidationTest {

    @Test
    void testProductValidation() {
        Product product = new Product("Laptop", 1000);

        // 正常系: 商品名と価格が有効
        XXXXXXXXXXX;  // assertTrue(product.isValid());

        // 異常系: 商品名が空
        product.setName("");
        XXXXXXXXXXX;  // assertFalse(product.isValid());

        // 異常系: 価格が負
        product.setPrice(-500);
        XXXXXXXXXXX;  // assertFalse(product.isValid());

        // 異常系: 商品名が空または価格が負 (Or)
        product.setName("");
        product.setPrice(-100);
        XXXXXXXXXXX;  // assertTrue(product.getName().isEmpty() || product.getPrice() < 0);

        // 正常系: 商品名が有効かつ価格が正 (And)
        product.setName("Phone");
        product.setPrice(500);
        XXXXXXXXXXX;  // assertTrue(!product.getName().isEmpty() && product.getPrice() > 0);
    }
}