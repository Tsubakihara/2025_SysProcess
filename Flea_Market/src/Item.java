public class Item {
    private int id;
    private String name;
    private int price;
    private String description;

    // 問題：XXXXXXXXXXを埋めてコードを完成させよ
    public Item(int id, String name, int price, String description) {
        XXXXXXXXXX = id;
        XXXXXXXXXX = name;
        XXXXXXXXXX = price;
        XXXXXXXXXX = description;
    }

    public int getId() {
        return XXXXXXXXXX;
    }

    public String getName() {
        return XXXXXXXXXX;
    }

    public int getPrice() {
        return XXXXXXXXXX;
    }

    public String getDescription() {
        return XXXXXXXXXX;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("商品名: " + name);
        System.out.println("価格: " + price + "円");
        System.out.println("説明: " + description);
        System.out.println("-------------------------");
    }
}
