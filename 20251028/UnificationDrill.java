// ============================================
// ファイル名: UnificationDrill.java
// 問題３：ユニフィケーション（単一化）
// ============================================

public class UnificationDrill {

    public static void main(String[] args) {

        System.out.println("--------------------------------");

        // ===============================
        // 問題1：基本的な一致確認
        String x = "apple";
        String y = "apple";

        if (x.___(y)) { // ← ここを埋めて同一文字列か判定
            System.out.println("1. x と y は一致する");
        } else {
            System.out.println("1. x と y は一致しない");
        }

        // ===============================
        // 問題2：変数に値を代入して一致確認
        int a = 5;
        int b;
        b = ___; // ← a の値を b に代入して一致させる

        if (a == b) {
            System.out.println("2. a と b は一致する");
        } else {
            System.out.println("2. a と b は一致しない");
        }

        // ===============================
        // 問題3：配列の要素一致
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean match = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != ___) { // ← arr2の要素を使って単一化を確認
                match = false;
                break;
            }
        }
        System.out.println("3. 配列は一致: " + match);

        // ===============================
        // 問題4：オブジェクトの一致判定
        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Alice", 20);

        if (p1.___(p2)) { // ← 名前と年齢が同じならtrueになるメソッド呼び出し
            System.out.println("4. p1 と p2 は一致");
        } else {
            System.out.println("4. p1 と p2 は不一致");
        }

        // ===============================
        // 問題5：条件による変数統合
        // 条件: もし age が0なら、age に defaultAge を代入
        int age = 0;
        int defaultAge = 25;

        if (age == 0) {
            age = ___; // ← age に defaultAge を代入
        }
        System.out.println("5. 年齢: " + age);

        System.out.println("--------------------------------");
        System.out.println("※ ___ を埋めて正しい出力を得ましょう。");
    }

    // ===============================
    // 問題4で使うメソッド: Personの比較
    static class Person {
        String name;
        int age;

        Person(String n, int a) {
            name = n;
            age = a;
        }

        // 名前と年齢が同じなら true を返す
        boolean match(Person other) {
            return this.name.equals(other.name) && this.age == other.age;
        }
    }
}
