package validator;

import java.util.ArrayList;
import java.util.List;
import model.Attendance;

public class AttendanceValidator {

    public List<String> validate(Attendance a) {

        List<String> errors = new ArrayList<>();

        // 氏名：必須
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("氏名は必須です。");
        }

        // 社員番号：必須 & 数字
        if (a.getEmployeeNumber() == null || a.getEmployeeNumber().isEmpty()) {
            errors.add("社員番号は必須です。");
        } else {
            if (!a.getEmployeeNumber().matches(XXXXXXXXXXX)) { // ←ヒント：数値正規表現
                errors.add("社員番号は数字のみで入力してください。");
            }
        }

        // 日付：必須
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("日付は必須です。");
        }

        // 出勤・退勤：開始 < 終了
        if (XXXXXXXXXXX.compareTo(XXXXXXXXXXX) >= 0) {
            errors.add("勤務時間の開始は終了より前である必要があります。");
        }

        // 休憩１：任意 → どちらも存在する場合のみチェック
        if (a.getBreak1Start() != null && a.getBreak1End() != null) {
            if (XXXXXXXXXXX.compareTo(XXXXXXXXXXX) >= 0) {
                errors.add("休憩1は開始が終了より前である必要があります。");
            }
        }

        // 休憩２
        if (a.getBreak2Start() != null && a.getBreak2End() != null) {
            if (XXXXXXXXXXX.compareTo(XXXXXXXXXXX) >= 0) {
                errors.add("休憩2は開始が終了より前である必要があります。");
            }
        }

        // 有給時間：任意 & 0以上
        if (a.getPaidLeaveHours() != null) {
            if (XXXXXXXXXXX < 0) {
                errors.add("有給時間は0以上で入力してください。");
            }
        }

        // 経費：任意 & 0以上
        if (a.getExpenses() != null) {
            if (XXXXXXXXXXX < 0) {
                errors.add("経費は0以上で入力してください。");
            }
        }

        return errors;
    }
}
