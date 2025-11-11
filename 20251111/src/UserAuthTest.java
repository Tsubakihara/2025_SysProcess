// ファイル名: UserAuthTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Userクラスは以下のイメージです。
// class User { 
//     private String userId; 
//     private String password; 
//     boolean isValidCredentials(String id, String pw) { return userId.equals(id) && password.equals(pw); }
// }

class UserAuthTest {

    @Test
    void testUserLogin() {
        User user = new User("user1", "pass123");

        // 正常系
        XXXXXXXXXXX;  // 

        // 異常系: ユーザーIDが間違い
        XXXXXXXXXXX;  // 

        // 異常系: パスワードが間違い
        XXXXXXXXXXX;  // 

        // 和(Or): ユーザーIDが間違いまたはパスワードが間違い
        XXXXXXXXXXX;  
    }
}
