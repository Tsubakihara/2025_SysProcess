// ============================

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ListingValidatorWhiteBoxTest {
	ListingValidator validator = new ListingValidator();

	// 命令網羅：全ての命令を最低1回通す
	@Test
	void testCommandCoverage() {
		boolean result1 = validator.isValidPrice(XXXXXXXXXXXXX); // ヒント：範囲外の値を入れ、return false に到達
		boolean result2 = validator.isValidPrice(XXXXXXXXXXXXX); // ヒント：範囲内の正常値
		assertFalse(result1);
		assertTrue(result2);
	}

	// 判定条件網羅：各条件の true/false をすべて発生させる
	@Test
	void testDecisionCoverage() {
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：300未満
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：9999999超
		assertTrue(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：正常値
	}

	// 条件網羅：条件①(price < 300), 条件②(price > 9999999), 条件③(price-fee>=1)
	@Test
	void testConditionCoverage() {
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // price<300 → true
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // price>9999999 → true
		assertTrue(validator.isValidPrice(XXXXXXXXXXXXX)); // 条件② false, 条件③ true
	}

	// 複数条件網羅（price<300 OR price>9999999 の組み合わせ網羅）
	@Test
	void testMultipleConditionCoverage() {
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：price<300 true、price>9999999 false
		assertFalse(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：price<300 false、price>9999999 true
		assertTrue(validator.isValidPrice(XXXXXXXXXXXXX)); // ヒント：両方 false（正常系）
	}
}
