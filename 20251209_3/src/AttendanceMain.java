import java.util.List;
import model.Attendance;
import validator.AttendanceValidator;

public class AttendanceMain {

    public static void main(String[] args) {

        Attendance a = new Attendance(
            "勤怠太郎",
            "8000",
            "2023/01/16",
            "09:00",
            "18:00",
            "12:00",
            "13:00",
            null,
            null,
            0.0,
            500.0,
            true,
            false,
            "特になし"
        );

        AttendanceValidator validator = new AttendanceValidator();
        List<String> errors = validator.validate(a);

        if (XXXXXXXXXXX.isEmpty()) { // ←ヒント：成功判定
            System.out.println("登録成功！");
        } else {
            System.out.println("エラーがあります：");
            XXXXXXXXXXX.forEach(System.out::println); // ←エラー一覧表示
        }
    }
}
