import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * ブラックボックステスト教材テンプレート
 * 対象: メルカリ出品機能 / 食べログ予約機能などを想定したテスト
 * 穴埋め箇所 → XXXXXXXXXXXXX
 */
public class BlackBoxTestTemplate {

    /**
     * 同値分割 (Equivalence Partitioning)
     */
    @Nested
    @DisplayName("同値分割テスト：商品価格バリデーション例 (メルカリ出品)")
    class EquivalencePartitioningTest {

        // テスト対象と想定するバリデーションメソッド
        private boolean validatePrice(int price) {
            return price >= 300 && price <= 9999999;
        }

        @Test
        @DisplayName("正常系：価格が同値クラス内に収まる")
        void testValidPrice() {
            int input = XXXXXXXXXXXXX; // 例：500
            boolean result = validatePrice(input);
            assertTrue(result);
        }

        @Test
        @DisplayName("異常系：価格が下限未満の同値クラス")
        void testPriceBelowLowerClass() {
            int input = XXXXXXXXXXXXX; // 例：100
            boolean result = validatePrice(input);
            assertFalse(result);
        }

        @Test
        @DisplayName("異常系：価格が上限超過の同値クラス")
        void testPriceAboveUpperClass() {
            int input = XXXXXXXXXXXXX; // 例：10000000
            boolean result = validatePrice(input);
            assertFalse(result);
        }
    }

    /**
     * 限界値分析 (Boundary Value Analysis)
     */
    @Nested
    @DisplayName("限界値分析テスト：予約人数バリデーション (食べログ予約)")
    class BoundaryValueAnalysisTest {

        private boolean validateReservationCount(int count) {
            return count >= 1 && count <= 20;
        }

        @Test
        @DisplayName("下限値：ちょうど1人 → OK")
        void testLowerBoundary() {
            int input = XXXXXXXXXXXXX; // 1
            assertTrue(validateReservationCount(input));
        }

        @Test
        @DisplayName("下限値より1少ない値 → NG")
        void testBelowLowerBoundary() {
            int input = XXXXXXXXXXXXX; // 0
            assertFalse(validateReservationCount(input));
        }

        @Test
        @DisplayName("上限値：ちょうど20人 → OK")
        void testUpperBoundary() {
            int input = XXXXXXXXXXXXX; // 20
            assertTrue(validateReservationCount(input));
        }

        @Test
        @DisplayName("上限値より1多い値 → NG")
        void testAboveUpperBoundary() {
            int input = XXXXXXXXXXXXX; // 21
            assertFalse(validateReservationCount(input));
        }
    }

    /**
     * 因果グラフ (Cause-Effect Graph)
     * 例：非公開出品が許可されるのは「出品者本人 && 年齢確認済み && カテゴリが成人カテゴリ以外」
     */
    @Nested
    @DisplayName("因果グラフテスト：非公開出品可否判定")
    class CauseEffectGraphTest {

        private boolean canPrivateListing(boolean isOwner, boolean isAgeVerified, String category) {
            return isOwner && isAgeVerified && !category.equals("adult");
        }

        @Test
        @DisplayName("条件がすべて真 → 非公開出品可能")
        void testAllTrue() {
            boolean result = canPrivateListing(
                XXXXXXXXXXXXX,  // isOwner
                XXXXXXXXXXXXX,  // isAgeVerified
                XXXXXXXXXXXXX   // category("fashion" など)
            );
            assertTrue(result);
        }

        @Test
        @DisplayName("年齢未確認 → 不可")
        void testAgeNotVerified() {
            boolean result = canPrivateListing(true, false, "fashion");
            assertFalse(result);
        }

        @Test
        @DisplayName("成人カテゴリ → 不可")
        void testAdultCategory() {
            boolean result = canPrivateListing(true, true, "adult");
            assertFalse(result);
        }
    }

    /**
     * 実験計画法 (Orthogonal Array / Pairwise Testing)
     * 例：食べログ予約フォーム
     * - 来店時間 (昼/夜)
     * - 支払い方法 (現金/カード)
     * - 座席タイプ (カウンター/テーブル)
     */
    @Nested
    @DisplayName("実験計画法テスト：予約設定組み合わせ")
    class ExperimentalDesignTest {

        @Test
        @DisplayName("直交表を使った組み合わせテスト例")
        void testPairwiseLike() {
            String time = XXXXXXXXXXXXX;   // "lunch" or "dinner"
            String payment = XXXXXXXXXXXXX; // "cash" or "card"
            String seat = XXXXXXXXXXXXX;   // "counter" or "table"

            // 疑似的なチェック
            assertNotNull(time);
            assertNotNull(payment);
            assertNotNull(seat);
        }
    }

    /**
     * エラー推測 (Error Guessing)
     * 開発者・QAが経験で怪しいところを狙い撃つ
     * 例：住所入力で不正な記号混入
     */
    @Nested
    @DisplayName("エラー推測テスト：住所入力")
    class ErrorGuessingTest {

        private boolean validateAddress(String address) {
            return address.matches("[A-Za-z0-9一-龥ぁ-んァ-ンー ー.-]+$");
        }

        @Test
        @DisplayName("怪しい絵文字入り → 失敗するはず")
        void testAddressWithEmoji() {
            String input = XXXXXXXXXXXXX; // 例："東京都😊区" のようなNG値
            boolean result = validateAddress(input);
            assertFalse(result);
        }
    }
}
