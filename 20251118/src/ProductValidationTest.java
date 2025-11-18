import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductValidationTest {

    @Test
    void testProductValidation() {
        Product product = new Product("Laptop", 1000);

        // 正常系: 商品名と価格が有効
        assertTrue(product.isValid());

        // 異常系: 商品名が空
        product.setName("");
        assertEquals(XXXXXXXXXX, product.isValid());

        // 異常系: 価格が負
        product.setName("Laptop");
        product.setPrice(-500);
        assertEquals(XXXXXXXXXX, product.isValid());

        // 異常系: 商品名が空または価格が負 (Or)
        product.setName("");
        product.setPrice(-100);
        assertTrue(product.getName().isEmpty() || product.getPrice() < 0);

        // 正常系: 商品名が有効かつ価格が正 (And)
        product.setName("Phone");
        product.setPrice(500);
        assertTrue(!product.getName().isEmpty() && product.getPrice() > 0);
    }

    // --------------------------------------------------
    // 追加バリエーション
    // --------------------------------------------------

    @Test
    void testNameAndPriceBoundary() {
        Product product = new Product("Book", 0);
        // 価格が0 → 無効
        assertEquals(XXXXXXXXXX, product.isValid());

        product.setPrice(1);
        // 最小正の価格 → 有効
        assertEquals(XXXXXXXXXX, product.isValid());
    }

    @Test
    void testNameOnlySpaces() {
        Product product = new Product("   ", 100);
        // 商品名が空白のみ → 無効とする場合
        assertEquals(XXXXXXXXXX, product.isValid());
    }

    @Test
    void testLongName() {
        String longName = "A".repeat(100);
        Product product = new Product(longName, 100);
        // 長すぎる名前でもバリデーションが許容する場合 → 有効
        assertEquals(XXXXXXXXXX, product.isValid());
    }

    @Test
    void testNegativePriceWithValidName() {
        Product product = new Product("Table", -1);
        // 価格が負 → 無効
        assertEquals(XXXXXXXXXX, product.isValid());
    }

    @Test
    void testOrConditionValidation() {
        Product product = new Product("", -10);
        // 商品名が空または価格が負 → true
        assertTrue(product.getName().isEmpty() || product.getPrice() < 0);
    }

    @Test
    void testAndConditionValidation() {
        Product product = new Product("Chair", 300);
        // 商品名が有効かつ価格が正 → true
        assertTrue(!product.getName().isEmpty() && product.getPrice() > 0);
    }
}
