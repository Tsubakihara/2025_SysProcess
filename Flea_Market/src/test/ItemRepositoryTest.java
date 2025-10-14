import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemRepositoryTest {

    private ItemRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new ItemRepository();
    }

    @Test
    public void testAddSingleItem() {
        Item item = new Item(1, "iPhone 14", 95000, "美品・SIMフリー");
        repository.addItem(item);

        List<Item> items = repository.getAllItems();
        assertEquals(1, items.size());
        assertEquals("iPhone 14", items.get(0).getName());
    }

    @Test
    public void testAddMultipleItems() {
        Item item1 = new Item(1, "iPhone 14", 95000, "美品・SIMフリー");
        Item item2 = new Item(2, "MacBook Pro", 180000, "M1モデル");

        repository.addItem(item1);
        repository.addItem(item2);

        List<Item> items = repository.getAllItems();
        assertEquals(2, items.size());
        assertEquals("MacBook Pro", items.get(1).getName());
    }

    @Test
    public void testItemGetters() {
        Item item = new Item(5, "Switch", 30000, "未使用");

        assertEquals(5, item.getId());
        assertEquals("Switch", item.getName());
        assertEquals(30000, item.getPrice());
        assertEquals("未使用", item.getDescription());
    }
}
