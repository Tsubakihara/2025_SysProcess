package model;

public class Product {

    private String image;
    private String name;
    private String description;
    private String category;
    private String condition;
    private String shippingFee;
    private String location;
    private String shippingDays;
    private Integer price;

    // コンストラクタ
    public Product(XXXXXXXXXXX image,
                   XXXXXXXXXXX name,
                   XXXXXXXXXXX description,
                   XXXXXXXXXXX category,
                   XXXXXXXXXXX condition,
                   XXXXXXXXXXX shippingFee,
                   XXXXXXXXXXX location,
                   XXXXXXXXXXX shippingDays,
                   XXXXXXXXXXX price) {

        this.image = image;
        this.name = name;
        this.description = description;
        this.category = category;
        this.condition = condition;
        this.shippingFee = shippingFee;
        this.location = location;
        this.shippingDays = shippingDays;
        this.price = price;
    }

    // getter（例：ここは固定）
    public String getImage() { return image; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getCondition() { return condition; }
    public String getShippingFee() { return shippingFee; }
    public String getLocation() { return location; }
    public String getShippingDays() { return shippingDays; }
    public Integer getPrice() { return price; }
}
