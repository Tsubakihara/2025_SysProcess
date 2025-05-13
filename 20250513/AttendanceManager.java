package demo;

import java.util.Calendar;

public class AttendanceManager {

    private String checkInTime;
    private String checkOutTime;
    private String breakTime1;
    private String breakTime2;

    public String checkIn() {
        checkInTime = getCurrentTime();
        return "出勤しました: " + checkInTime;
    }

    public String checkOut() {
        checkOutTime = getCurrentTime();
        return "退勤しました: " + checkOutTime;
    }

    public String takeBreak() {
        String time = getCurrentTime();
        if (breakTime1 == null) {
            breakTime1 = time;
            return "1回目の休憩: " + time;
        } else if (breakTime2 == null) {
            breakTime2 = time;
            return "2回目の休憩: " + time;
        } else {
            return "これ以上休憩できません。";
        }
    }

    public void showReport() {
        System.out.println("=== 今日の勤怠レポート ===");
        System.out.println("出勤時間: " + (checkInTime != null ? checkInTime : "記録なし"));
        System.out.println("退勤時間: " + (checkOutTime != null ? checkOutTime : "記録なし"));
        System.out.println("休憩1回目: " + (breakTime1 != null ? breakTime1 : "記録なし"));
        System.out.println("休憩2回目: " + (breakTime2 != null ? breakTime2 : "記録なし"));
    }

    private String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        return String.format("%02d:%02d", hour, min);
    }

    public static void main(String[] args) {
    	AttendanceManager am = new AttendanceManager();
        System.out.println(am.checkIn());
        System.out.println(am.takeBreak());
        System.out.println(am.takeBreak());
        System.out.println(am.checkOut());
        am.showReport();
    }
}
