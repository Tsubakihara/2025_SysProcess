public class Main {
    public static void main(String[] args) {
        ItemRepository repo = new ItemRepository();

        // 商品追加
        repo.addItem(new Item(1, "iPhone 17", 195000, "美品・SIMフリー"));
        // 追加：addItemメソッドを使用して商品を5つ以上出品して欲しい

        System.out.println("=== 商品一覧 ===");

        for (Item item : repo.getAllItems()) {
            item.display();
        }
    }
}
