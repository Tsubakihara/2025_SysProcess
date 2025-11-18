// User.java
class User { 
    private String userId; 
    private String password; 

    // コンストラクタを追加
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    // 認証メソッド
    public boolean isValidCredentials(String id, String pw) { 
        return userId.equals(id) && password.equals(pw); 
    }
}
