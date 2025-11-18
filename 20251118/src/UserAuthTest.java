import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserAuthTest {

    @Test
    void testUserLogin() {
        User user = new User("user1", "pass123");

        // 正常系
        assertTrue(user.isValidCredentials("user1", "pass123")); 

        // 異常系: ユーザーIDが間違い
        assertFalse(user.isValidCredentials("user2", "pass123")); 

        // 異常系: パスワードが間違い
        assertFalse(user.isValidCredentials("user1", "wrongpass"));

        // 和(Or): ユーザーIDが間違いまたはパスワードが間違い
        assertTrue(!user.isValidCredentials("user2", "pass123") || !user.isValidCredentials("user1", "wrongpass"));
    }

    // --------------------------------------------------
    // 追加バリエーション
    // --------------------------------------------------

    @Test
    void testEmptyUserId() {
        User user = new User("user1", "pass123");
        // ユーザーIDが空 → 無効
        assertEquals(XXXXXXXXXX, user.isValidCredentials("", "pass123"));
    }

    @Test
    void testEmptyPassword() {
        User user = new User("user1", "pass123");
        // パスワードが空 → 無効
        assertEquals(XXXXXXXXXX, user.isValidCredentials("user1", ""));
    }

    @Test
    void testBothEmpty() {
        User user = new User("user1", "pass123");
        // ユーザーIDとパスワードが両方空 → 無効
        assertEquals(XXXXXXXXXX, user.isValidCredentials("", ""));
    }

    @Test
    void testLongUserId() {
        String longUserId = "U".repeat(50);
        User user = new User(longUserId, "pass123");
        // 長すぎるユーザーIDでも正確なら有効
        assertEquals(XXXXXXXXXX, user.isValidCredentials(longUserId, "pass123"));
    }

    @Test
    void testLongPassword() {
        String longPassword = "P".repeat(50);
        User user = new User("user1", longPassword);
        // 長すぎるパスワードでも正確なら有効
        assertEquals(XXXXXXXXXX, user.isValidCredentials("user1", longPassword));
    }

    @Test
    void testOrConditionValidation() {
        User user = new User("user1", "pass123");
        // ユーザーIDが間違いまたはパスワードが間違い → true
        assertTrue(!user.isValidCredentials("wrongUser", "pass123") || !user.isValidCredentials("user1", "wrongPass"));
    }

    @Test
    void testAndConditionValidation() {
        User user = new User("user1", "pass123");
        // ユーザーIDが正確かつパスワードも正確 → true
        assertTrue(user.isValidCredentials("user1", "pass123") && user.isValidCredentials("user1", "pass123"));
    }
}
