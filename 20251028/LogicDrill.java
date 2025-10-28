// ============================================
// ファイル名: LogicDrill.java
// 問題1：論理的な知識問題
// ============================================

public class LogicDrill {
    public static void main(String[] args) {

        System.out.println("--------------------------------");

        // ===============================
        // 問題1：複合条件（ANDとORの優先順位）
        // 条件：年齢が18歳以上 かつ 学生である または メンバー登録済みなら「割引あり」
        int age = 20;
        boolean isStudent = false;
        boolean isMember = true;

        if ((age >= 18 && isStudent) ___ isMember) { // ← ここを埋めよう
            System.out.println("1. 割引あり");
        } else {
            System.out.println("1. 割引なし");
        }

        // ===============================
        // 問題2：否定と論理積の組み合わせ
        // 条件：雨が降っておらず、かつ風も強くない場合は「散歩に出かける」
        boolean isRaining = true;
        boolean isWindy = false;

        if (___isRaining && ___isWindy) { // ← ここを埋めよう（ヒント：NOTを使う）
            System.out.println("2. 散歩に出かける");
        } else {
            System.out.println("2. 家にいる");
        }

        // ===============================
        // 問題3：排他的論理（XOR的思考）
        // 条件：AまたはBのどちらか一方だけがtrueのとき「スイッチON」
        boolean A = true;
        boolean B = true;

        if ((A ___ B) && ___(A && B)) { // ← ここを埋めよう（ヒント：XORを模した条件を使用する）
            System.out.println("3. スイッチON");
        } else {
            System.out.println("3. スイッチOFF");
        }

        // ===============================
        // 問題4：多段条件（入れ子のif）
        // 条件：得点が80以上なら「合格」。
        // ただし90以上かつ課題提出済みなら「優秀」と表示する。
        int score = 92;
        boolean submitted = false;

        if (score >= 80) {
            if (score >= 90 ___ submitted) { // ← ここを埋めよう（AND条件）
                System.out.println("4. 優秀");
            } else {
                System.out.println("4. 合格");
            }
        } else {
            System.out.println("4. 不合格");
        }

        // ===============================
        // 問題5：三重論理と推論
        // 条件：ログイン済み かつ （管理者 または 編集権限がある）場合「アクセス許可」
        boolean loggedIn = true;
        boolean isAdmin = false;
        boolean canEdit = true;

        if (loggedIn && (isAdmin ___ canEdit)) { // ← ここを埋めよう（OR条件）
            System.out.println("5. アクセス許可");
        } else {
            System.out.println("5. アクセス拒否");
        }

        System.out.println("--------------------------------");
        System.out.println("※ ___ を埋めて正しい出力を得ましょう。");
    }
}
