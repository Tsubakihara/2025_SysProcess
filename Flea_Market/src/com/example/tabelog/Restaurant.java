// ファイル名: Restaurant.java
// 実行方法: javac Restaurant.java && java Restaurant

package com.example.tabelog;

public class Restaurant {
    private String XXXXXXXXX;   // 店舗名
    private int XXXXXXXXX;      // 定員数

    public Restaurant(String name, int capacity) {
        this.XXXXXXXXX = name;
        this.XXXXXXXXX = capacity;
    }

    public String getName() {
        return XXXXXXXXX;
    }

    public int getCapacity() {
        return XXXXXXXXX;
    }

    @Override
    public String toString() {
        return XXXXXXXXX + "（定員: " + XXXXXXXXX + "名）";
    }
}