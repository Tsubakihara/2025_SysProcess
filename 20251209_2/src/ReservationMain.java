import java.util.List;
import model.ReservationSeat;
import validator.ReservationSeatValidator;

public class ReservationMain {

    public static void main(String[] args) {

        ReservationSeat seat = new ReservationSeat(
                "テーブル席",
                "テーブル席",
                "禁煙",
                2, 4,
                3,
                true,      // コネクトによる席連結あり
                12,        // 12名まで予約可能
                "なし",
                "18:00",
                "23:30"
        );

        ReservationSeatValidator validator = new ReservationSeatValidator();
        List<String> errors = validator.validate(seat);

        if (errors.isEmpty()) {  // ← 正常
            System.out.println("登録成功！");
        } else {
            System.out.println("エラーがあります：");
            errors.forEach(System.out::println);
        }
    }
}
