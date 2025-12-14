package attendance;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/*
 * 勤怠データを就業規則・36協定に基づいて検証するクラス。
 * 日次・週次・月次の労働時間、深夜労働、休日労働および
 * 代休取得状況を総合的にチェックする。
 */
public class AttendanceValidator {

    // ===== 就業規則・36協定 =====
    private static final int DAILY_OVERTIME_LIMIT = XXXXXXXXXX;   // ヒント：12時間×60
    private static final int REQUIRED_BREAK_MINUTES = XXXXXXXXXX; // ヒント：1時間×60
    private static final int WEEKLY_WARNING_LIMIT = XXXXXXXXXX;   // ヒント：60時間×60
    private static final int MONTHLY_OVERTIME_LIMIT = XXXXXXXXXX; // ヒント：80時間×60

    /**
     * 週末に1週間分の勤怠をまとめて検証する
     */
    public static void validateWeekly(
            List<Attendance> weeklyAttendances,
            int monthlyOvertimeMinutes
    ) {

        int weeklyTotalMinutes = 0;
        int weeklyNightMinutes = 0;
        int holidayWorkDays = 0;
        int compensatoryDays = 0;

        for (Attendance attendance : weeklyAttendances) {

            checkTimeOrder(attendance);
            checkBreakTime(attendance);
            checkDailyWorkingTime(attendance);

            weeklyTotalMinutes += XXXXXXXXXX;
            // ヒント：1日の実労働時間を加算

            weeklyNightMinutes += XXXXXXXXXX;
            // ヒント：深夜労働時間を算出して加算

            if (attendance.isHolidayWork()) {
                holidayWorkDays++;

                if (attendance.isCompensatoryTaken()) {
                    compensatoryDays++;
                }
            }
        }

        checkWeeklyWorkingTime(weeklyTotalMinutes);
        checkMonthlyOvertime(monthlyOvertimeMinutes);
        checkCompensatoryHoliday(holidayWorkDays, compensatoryDays);

        if (weeklyNightMinutes > 0) {
            System.out.println("週の深夜労働時間：" + weeklyNightMinutes + " 分");
        }
    }

    /**
     * 開始時刻が終了時刻より前であることを確認
     */
    private static void checkTimeOrder(Attendance attendance) {
        if (attendance.getStartTime()
                .XXXXXXXXXX(attendance.getEndTime())) {
            // ヒント：開始が終了以降か判定
            throw new IllegalArgumentException("開始・終了時刻が不正です");
        }
    }

    /**
     * 休憩時間が1時間以上あるか確認
     */
    private static void checkBreakTime(Attendance attendance) {
        if (attendance.getBreakMinutes() < XXXXXXXXXX) {
            throw new IllegalArgumentException("休憩時間が1時間未満です");
        }
    }

    /**
     * 1日12時間超の労働がある場合は警告
     */
    private static void checkDailyWorkingTime(Attendance attendance) {
        if (attendance.getWorkingMinutes() > DAILY_OVERTIME_LIMIT) {
            System.out.println("日次時間外労働あり");
        }
    }

    /**
     * 週60時間超の労働がある場合は警告
     */
    private static void checkWeeklyWorkingTime(int weeklyMinutes) {
        if (weeklyMinutes > WEEKLY_WARNING_LIMIT) {
            System.out.println("警告：週60時間超の労働");
        }
    }

    /**
     * 月80時間超の時間外労働は禁止（36協定）
     */
    private static void checkMonthlyOvertime(int monthlyOvertimeMinutes) {
        if (monthlyOvertimeMinutes > MONTHLY_OVERTIME_LIMIT) {
            throw new IllegalArgumentException("36協定違反：月80時間超");
        }
    }

    /**
     * 休日労働に対して代休が取得されているか確認
     */
    private static void checkCompensatoryHoliday(
            int holidayWorkDays,
            int compensatoryDays
    ) {
        if (holidayWorkDays > compensatoryDays) {
            throw new IllegalArgumentException(
                    "休日労働に対する代休が不足しています"
            );
        }
    }

    /**
     * 深夜労働時間（22:00〜5:00）を算出する
     */
    private static int calculateNightMinutes(Attendance attendance) {

        LocalDateTime start = attendance.getStartTime();
        LocalDateTime end = attendance.getEndTime();

        LocalDateTime nightStart = start
                .XXXXXXXXXX()          // ヒント：日付を取得
                .atTime(XXXXXXXXXX);   // ヒント：22:00

        LocalDateTime nightEnd = nightStart
                .XXXXXXXXXX(1)         // ヒント：翌日
                .withHour(XXXXXXXXXX); // ヒント：5時

        LocalDateTime overlapStart = XXXXXXXXXX(start, nightStart);
        LocalDateTime overlapEnd = XXXXXXXXXX(end, nightEnd);

        if (overlapStart.isBefore(overlapEnd)) {
            return (int) Duration
                    .XXXXXXXXXX(overlapStart, overlapEnd)
                    .toMinutes();
        }

        return 0;
    }
}
