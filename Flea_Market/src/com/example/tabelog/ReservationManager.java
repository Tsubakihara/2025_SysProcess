// ファイル名: ReservationManager.java
// 実行方法: javac ReservationManager.java && java ReservationManager

package com.example.tabelog;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> XXXXXXXXX = new ArrayList<>();

    // 予約登録
    public boolean addReservation(Reservation reservation) {
        for (Reservation r : XXXXXXXXX) {
            if (r.getRestaurant().getName().equals(XXXXXXXXX.getRestaurant().getName()) &&
                r.getDateTime().equals(XXXXXXXXX.getDateTime())) {
                System.out.println("⚠️ 既に同じ日時に予約があります。");
                return false;
            }
        }
        XXXXXXXXX.add(reservation);
        System.out.println("✅ 予約が登録されました。");
        return true;
    }

    // 予約一覧表示
    public void showAllReservations() {
        if (XXXXXXXXX.isEmpty()) {
            System.out.println("予約はまだありません。");
        } else {
            System.out.println("\n=== 予約一覧 ===");
            for (Reservation r : XXXXXXXXX) {
                System.out.println(r);
            }
        }
    }
}
