// ファイル名: Main.java
// 実行方法: javac Main.java && java com.example.tabelog.Main

package com.example.tabelog;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("焼肉 たべログ亭", 30);
        ReservationManager manager = new ReservationManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 食べログ風 予約管理システム ===");
        while (true) {
            System.out.println("\n1: 予約登録　2: 一覧表示　0: 終了");
            System.out.print("選択してください: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (XXXXXXXXX) {
                case 1:
                    System.out.print("お名前: ");
                    String name = scanner.nextLine();
                    System.out.print("電話番号: ");
                    String phone = scanner.nextLine();
                    System.out.print("人数: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    System.out.print("予約日時 (例: 2025-10-20T18:00): ");
                    String dateInput = scanner.nextLine();

                    Customer customer = new XXXXXXXXX(name, phone);
                    LocalDateTime dateTime = LocalDateTime.parse(XXXXXXXXX);

                    Reservation reservation = new XXXXXXXXX(restaurant, customer, dateTime, num);
                    XXXXXXXXX.addReservation(reservation);
                    break;
                case 2:
                    XXXXXXXXX.showAllReservations();
                    break;
                case 0:
                    System.out.println("終了します。");
                    XXXXXXXXX.close();
                    return;
                default:
                    System.out.println("⚠️ 無効な選択です。");
            }
        }
    }
}
