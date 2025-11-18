// ContactForm.java
public class ContactForm { 
    private String name; 
    private String email; 
    private String message; 

    // コンストラクタを追加
    public ContactForm(String name, String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }

    // 認証メソッド
    public boolean isValid() {
        // 名前チェック
        if (name == null || name.trim().isEmpty()) return false;

        // メールチェック
        if (email == null || !email.contains("@") || email.contains(" ")) return false;

        // メッセージチェック
        if (message == null || message.trim().isEmpty()) return false;

        return true;
    }

    // setter/getter を追加
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
