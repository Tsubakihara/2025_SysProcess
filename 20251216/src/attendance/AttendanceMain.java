package attendance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 * 勤怠管理システムのエントリーポイントとなるクラス。
 * 社員が週末に1週間分の勤怠をまとめて入力する場面を想定し、
 * 検証処理を呼び出して結果を確認する。
 */
public class AttendanceMain {

    public static void main(String[] args) {

        List<Attendance> weeklyAttendances = new ArrayList<>();

        // ヒント：平日（休日労働なし）
        weeklyAttendances.add(new Attendance(
                LocalDateTime.of(XXXXXXXXXX, XXXXXXXXXX, XXXXXXXXXX, 9, 0),
                LocalDateTime.of(XXXXXXXXXX, XXXXXXXXXX, XXXXXXXXXX, 21, 0),
                XXXXXXXXXX,
                false,
                false
        ));

        // ヒント：休日労働あり（代休未取得 → エラー）
        weeklyAttendances.add(new Attendance(
                LocalDateTime.of(XXXXXXXXXX, XXXXXXXXXX, XXXXXXXXXX, 10, 0),
                LocalDateTime.of(XXXXXXXXXX, XXXXXXXXXX, XXXXXXXXXX, 18, 0),
                XXXXXXXXXX,
                true,
                false
        ));

        int monthlyOvertimeMinutes = XXXXXXXXXX;
        // ヒント：80時間（4800分）を超えるかどうかで結果が変わる

        AttendanceValidator
                .XXXXXXXXXX(weeklyAttendances, monthlyOvertimeMinutes);
        // ヒント：週次検証メソッドを呼び出す
    }
}
