package model;

public class Attendance {

    private String name;
    private String employeeNumber;
    private String date;
    private String startTime;
    private String endTime;
    private String break1Start;
    private String break1End;
    private String break2Start;
    private String break2End;
    private Double paidLeaveHours;
    private Double expenses;
    private Boolean lunch;
    private Boolean allowance;
    private String remark;

    public Attendance(
        XXXXXXXXXXX name,
        XXXXXXXXXXX employeeNumber,
        XXXXXXXXXXX date,
        XXXXXXXXXXX startTime,
        XXXXXXXXXXX endTime,
        XXXXXXXXXXX break1Start,
        XXXXXXXXXXX break1End,
        XXXXXXXXXXX break2Start,
        XXXXXXXXXXX break2End,
        XXXXXXXXXXX paidLeaveHours,
        XXXXXXXXXXX expenses,
        XXXXXXXXXXX lunch,
        XXXXXXXXXXX allowance,
        XXXXXXXXXXX remark
    ) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.break1Start = break1Start;
        this.break1End = break1End;
        this.break2Start = break2Start;
        this.break2End = break2End;
        this.paidLeaveHours = paidLeaveHours;
        this.expenses = expenses;
        this.lunch = lunch;
        this.allowance = allowance;
        this.remark = remark;
    }

    // getter …（省略しない）
    public String getName() { return name; }
    public String getEmployeeNumber() { return employeeNumber; }
    public String getDate() { return date; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
    public String getBreak1Start() { return break1Start; }
    public String getBreak1End() { return break1End; }
    public String getBreak2Start() { return break2Start; }
    public String getBreak2End() { return break2End; }
    public Double getPaidLeaveHours() { return paidLeaveHours; }
    public Double getExpenses() { return expenses; }
    public Boolean getLunch() { return lunch; }
    public Boolean getAllowance() { return allowance; }
    public String getRemark() { return remark; }
}
