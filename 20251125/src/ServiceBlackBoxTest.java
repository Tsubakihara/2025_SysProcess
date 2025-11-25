import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ServiceBlackBoxTest {

	ListingValidator listingValidator = new ListingValidator();
	ReservationService reservationService = new ReservationService();

	// メルカリ：正常に出品できるケース
	@Test
	void testListingSuccess() {
		boolean result = listingValidator.isValidPrice(XXXXXXXXXXXXX); // ヒント：300〜9999999 の中で正常値
		assertTrue(result);
	}

	// メルカリ：価格が下限未満
	@Test
	void testListingTooLow() {
		boolean result = listingValidator.isValidPrice(XXXXXXXXXXXXX); // ヒント：299など
		assertFalse(result);
	}

	// 食べログ：ランチ予約成功
	@Test
	void testReservationLunchSuccess() {
		boolean result = reservationService.reserve(XXXXXXXXXXXXX, "lunch", true); // ヒント：正の人数
		assertTrue(result);
	}

	// 食べログ：時間帯不正
	@Test
	void testReservationWrongTimeslot() {
		boolean result = reservationService.reserve(2, XXXXXXXXXXXXX, true); // ヒント：lunch/dinner 以外
		assertFalse(result);
	}

	// 食べログ：人数0 → 予約不可
	@Test
	void testReservationZeroPeople() {
		boolean result = reservationService.reserve(0, "dinner", true);
		assertFalse(result);
	}
}
