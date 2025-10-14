// ファイル名: Reservation.java
// 実行方法: javac Reservation.java && java Reservation

package com.example.tabelog;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Restaurant XXXXXXXXX;
    private Customer XXXXXXXXX;
    private LocalDateTime XXXXXXXXX;
    private int XXXXXXXXX;

    public Reservation(Restaurant restaurant, Customer customer, LocalDateTime dateTime, int numberOfPeople) {
        this.XXXXXXXXX = restaurant;
        this.XXXXXXXXX = customer;
        this.XXXXXXXXX = dateTime;
        this.XXXXXXXXX = numberOfPeople;
    }

    public LocalDateTime getDateTime() {
        return XXXXXXXXX;
    }

    public int getNumberOfPeople() {
        return XXXXXXXXX;
    }

    public Restaurant getRestaurant() {
        return XXXXXXXXX;
    }

    @Override
    public String toString() {
        return String.format("%s に %s が %d名で予約（日時: %s）",
                XXXXXXXXX.getName(),
                XXXXXXXXX.getName(),
                XXXXXXXXX,
                XXXXXXXXX.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
    }
}
