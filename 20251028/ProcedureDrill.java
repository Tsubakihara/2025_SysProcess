// ============================================
// ファイル名: ProcedureDrill.java
// ============================================

public class ProcedureDrill {

    public static void main(String[] args) {

        System.out.println("--------------------------------");

        // ===============================
        // 問題1：順次処理の理解
        // 以下の処理で「合計: 30」と出力されるように、空欄を埋めよう
        int a = 10;
        int b = 20;
        int sum;

        // 計算してsumに代入する
        sum = ___ + ___; // ← ここを埋めよう

        System.out.println("1. 合計: " + sum);

        // ===============================
        // 問題2：条件分岐の流れ
        // ageが20以上なら「成人」、それ未満なら「未成年」と表示されるように
        int age = 19;
        if (___ >= 20) { // ← ここを埋めよう
            System.out.println("2. 成人");
        } else {
            System.out.println("2. 未成年");
        }

        // ===============================
        // 問題3：繰り返し処理
        // 1から5までの数字を順に表示する
        for (int i = ___; i <= ___; i++) { // ← ここを埋めよう
            System.out.print(i + " ");
        }
        System.out.println();

        // ===============================
        // 問題4：メソッド呼び出し（手続き的な分割）
        // メソッド doubleNumber() を呼び出して、引数の2倍の値を返す
        int value = 7;
        int result = ___(value); // ← ここを埋めよう（メソッド呼び出し）
        System.out.println("4. 2倍の値: " + result);

        // ===============================
        // 問題5：ネストされた手続き処理（条件＋繰り返し）
        // 偶数だけを合計して出力する（1～10の中で）
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            if (___) { // ← 偶数条件を埋めよう
                total += i;
            }
        }
        System.out.println("5. 偶数の合計: " + total);

        System.out.println("--------------------------------");
        System.out.println("※ ___ を埋めて正しい出力を得ましょう。");
    }

    // 値を2倍にして返すメソッド
    public static int doubleNumber(int x) {
        return ___; // ← ここを埋めよう
    }
}
