// ファイル名: Product.java
class Product { 
    private String name; 
    private int price; 

    // コンストラクタ
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // バリデーションメソッド
    boolean isValid() { 
        return !name.isEmpty() && price > 0; 
    }

    // setter/getter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}