// ファイル名: ContactFormTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// ContactFormクラスのイメージ
// class ContactForm { 
//     private String name; 
//     private String email; 
//     private String message; 
//     boolean isValid() { return !name.isEmpty() && email.contains("@") && !message.isEmpty(); }
//     /* setter/getter省略 */ 
// }

class ContactFormTest {

    @Test
    void testContactForm() {
        ContactForm form = new ContactForm("Taro", "taro@example.com", "こんにちは");

        // 正常系
        XXXXXXXXXXX;  // 

        // 異常系: 名前が空
        form.setName("");
        XXXXXXXXXXX;  // 

        // 異常系: メールアドレスが不正
        form.setEmail("invalid-email");
        XXXXXXXXXXX;  // 

        // 異常系: 内容が空
        form.setMessage("");
        XXXXXXXXXXX;  // 

        // 和(Or): 名前が空またはメールが不正
        form.setName("");
        form.setEmail("invalid-email");
        XXXXXXXXXXX;  // 

        // 積(And): 名前が有効かつメールが有効
        form.setName("Hanako");
        form.setEmail("hanako@example.com");
        XXXXXXXXXXX;  // 
    }
}