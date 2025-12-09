import java.util.List;
import model.Product;
import validator.ProductValidator;

public class Main {

    public static void main(String[] args) {

        // 仮データセット（自由に変更OK）
        Product product = new Product(
            "photo.jpg",
            "テスト商品",
            "とても良い商品です",
            "ファッション",
            "目立った傷や汚れなし",
            "送料込み",
            "東京都",
            "1〜2日で発送",
            300
        );

        // Validator実行
        ProductValidator validator = new ProductValidator();
        List<String> errors = validator.validate(product);

        // 結果出力
        if (XXXXXXXXXXX.isEmpty()) { // ←ヒント：エラー判定
            System.out.println("出品成功！");
        } else {
            System.out.println("エラーがあります：");
            XXXXXXXXXXX.forEach(System.out::println); // ←ヒント：一覧表示
        }
    }
}
