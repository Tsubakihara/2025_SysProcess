package validator;

import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductValidator {

    // 戻り値：エラーのリスト
    public List<String> validate(Product p) {

        // 空のエラーリスト作成
        List<String> errors = new ArrayList<>();

        // ---- 画像チェック ----
        if (p.getImage() == null || p.XXXXXXXXXXX().isEmpty()) { // ←ヒント：画像が空なら
            errors.add("出品画像は必須です。");
        }

        // ---- 商品名チェック ----
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) { // ←ヒント：name が空
            errors.add("商品名は必須です。");
        } else if (XXXXXXXXXXX.length() > 40) { // ←ヒント：文字数制限
            errors.add("商品名は40文字以内で入力してください。");
        }

        // ---- 商品説明チェック ----
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("商品説明は必須です。");
        } else if (XXXXXXXXXXX.length() > 1000) {
            errors.add("商品説明は1000文字以内で入力してください。");
        }

        // ---- プルダウン必須 ----
        if (p.getCategory() == null || p.getCategory().equals(XXXXXXXXXXX)) { // ←ヒント："---"
            errors.add("カテゴリーは必須です。");
        }

        if (p.getCondition() == null || p.getCondition().equals(XXXXXXXXXXX)) {
            errors.add("商品の状態は必須です。");
        }

        if (p.getShippingFee() == null || p.getShippingFee().equals(XXXXXXXXXXX)) {
            errors.add("配送料の負担は必須です。");
        }

        if (p.getLocation() == null || p.getLocation().equals(XXXXXXXXXXX)) {
            errors.add("発送元の地域は必須です。");
        }

        if (p.getShippingDays() == null || p.getShippingDays().equals(XXXXXXXXXXX)) {
            errors.add("発送までの日数は必須です。");
        }

        // ---- 価格チェック ----
        if (p.getPrice() == null) {
            errors.add("価格は必須です。");
        } else {
            if (p.getPrice() < XXXXXXX || p.getPrice() > XXXXXXX) { // ←ヒント：範囲
                errors.add("価格は300〜9,999,999円の範囲で入力してください。");
            }
        }

        // エラー一覧を返す
        return errors;
    }
}
