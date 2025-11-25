// 対象クラス（例：食べログの予約ロジック）
public class ReservationService {
	// 人数>0、時間帯が"lunch" or "dinner"、かつ予約枠が残っている場合に予約成功
	public boolean reserve(int people, String timeSlot, boolean hasVacancy) {
		if (people <= 0) return false; // 条件①
		if (!timeSlot.equals("lunch") && !timeSlot.equals("dinner")) return false; // 条件②（複数条件テスト用）
		return hasVacancy; // 条件③
	}
}