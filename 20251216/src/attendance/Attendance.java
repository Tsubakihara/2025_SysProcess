package attendance;

import java.time.Duration;
import java.time.LocalDateTime;

/*
 * 勤怠情報（1日分）を表すクラス。
 * 出退勤時刻・休憩時間・休日労働・代休取得の有無を保持し、
 * 実労働時間の算出を責務とする。
 */
public class Attendance {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int breakMinutes;
    private boolean holidayWork;
    private boolean compensatoryTaken;

    public Attendance(
            LocalDateTime startTime,
            LocalDateTime endTime,
            int breakMinutes,
            boolean holidayWork,
            boolean compensatoryTaken
    ) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.breakMinutes = breakMinutes;
        this.holidayWork = holidayWork;
        this.compensatoryTaken = compensatoryTaken;
    }

    public LocalDateTime getStartTime() {
        return XXXXXXXXXX; // ヒント：開始時刻フィールド
    }

    public LocalDateTime getEndTime() {
        return XXXXXXXXXX; // ヒント：終了時刻フィールド
    }

    public int getBreakMinutes() {
        return XXXXXXXXXX; // ヒント：休憩時間（分）
    }

    public boolean isHolidayWork() {
        return XXXXXXXXXX; // ヒント：休日労働フラグ
    }

    public boolean isCompensatoryTaken() {
        return XXXXXXXXXX; // ヒント：代休取得フラグ
    }

    /**
     * 実労働時間（分）を算出する
     */
    public int getWorkingMinutes() {

        long totalMinutes = Duration
                .XXXXXXXXXX(startTime, endTime) // ヒント：日時の差分
                .toMinutes();

        // ヒント：総拘束時間 − 休憩時間
        return (int) totalMinutes - XXXXXXXXXX;
    }
}
