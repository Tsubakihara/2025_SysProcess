// 対象クラス（例：メルカリの出品価格バリデーション）
class ListingValidator {
	// 価格が300〜9,999,999 円の範囲内で、かつ手数料10%を引いた金額が 1円以上なら出品可能
	public boolean isValidPrice(int price) {
		if (price < 300 || price > 9999999) { // 判定条件①
			return false;
		}
		int fee = (int)(price * 0.1); // 命令
		return (price - fee) >= 1; // 判定条件②
	}
}

