package model;

public class ReservationSeat {

    private String seatType;
    private String managementName;
    private String smokingType;
    private Integer minPeople;
    private Integer maxPeople;
    private Integer maxTables;
    private Boolean connectable;
    private Integer connectLimit;
    private String privateRoom;
    private String startTime;
    private String endTime;

    public ReservationSeat(
            XXXXXXXXXXX seatType,        // 必須
            XXXXXXXXXXX managementName,  // 必須
            XXXXXXXXXXX smokingType,     // 禁煙/喫煙
            XXXXXXXXXXX minPeople,
            XXXXXXXXXXX maxPeople,
            XXXXXXXXXXX maxTables,
            XXXXXXXXXXX connectable,     // true/false
            XXXXXXXXXXX connectLimit,    // 12名上限
            XXXXXXXXXXX privateRoom,     // なし/あり
            XXXXXXXXXXX startTime,       // 例: "18:00"
            XXXXXXXXXXX endTime          // 例: "23:30"
    ) {
        this.seatType = seatType;
        this.managementName = managementName;
        this.smokingType = smokingType;
        this.minPeople = minPeople;
        this.maxPeople = maxPeople;
        this.maxTables = maxTables;
        this.connectable = connectable;
        this.connectLimit = connectLimit;
        this.privateRoom = privateRoom;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // getter （省略せず実装）
    public String getSeatType() { return seatType; }
    public String getManagementName() { return managementName; }
    public String getSmokingType() { return smokingType; }
    public Integer getMinPeople() { return minPeople; }
    public Integer getMaxPeople() { return maxPeople; }
    public Integer getMaxTables() { return maxTables; }
    public Boolean getConnectable() { return connectable; }
    public Integer getConnectLimit() { return connectLimit; }
    public String getPrivateRoom() { return privateRoom; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
}
