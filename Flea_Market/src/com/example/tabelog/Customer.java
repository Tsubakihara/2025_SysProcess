// ファイル名: Customer.java
// 実行方法: javac Customer.java && java Customer

package com.example.tabelog;

public class Customer {
    private String XXXXXXXXX; // 名前
    private String XXXXXXXXX; // 電話番号

    public Customer(String name, String phone) {
        this.XXXXXXXXX = name;
        this.XXXXXXXXX = phone;
    }

    public String getName() {
        return XXXXXXXXX;
    }

    public String getPhone() {
        return XXXXXXXXX;
    }

    @Override
    public String toString() {
        return XXXXXXXXX + "（電話番号: " + XXXXXXXXX + "）";
    }
}
