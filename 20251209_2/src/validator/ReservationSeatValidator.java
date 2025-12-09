package validator;

import java.util.ArrayList;
import java.util.List;
import model.ReservationSeat;

public class ReservationSeatValidator {

    public List<String> validate(ReservationSeat r) {

        List<String> errors = new ArrayList<>();

        // 席の種類：必須
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("席の種類は必須です。");
        }

        // 管理名称：必須
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("店舗管理名称は必須です。");
        }

        // 禁煙/喫煙：必須（例：禁煙 or 喫煙）
        if (XXXXXXXXXXX == null ||
            !(XXXXXXXXXXX.equals("禁煙") || XXXXXXXXXXX.equals("喫煙"))) {
            errors.add("禁煙/喫煙はどちらかを選択してください。");
        }

        // 定員数：min <= max
        if (XXXXXXXXXXX > XXXXXXXXXXX) {  // ←ヒント：逆転してたらエラー
            errors.add("定員数は最小人数が最大人数を超えないよう設定してください。");
        }

        // 最大販売卓数：1以上
        if (XXXXXXXXXXX < 1) {
            errors.add("最大販売卓数は1以上で設定してください。");
        }

        // コネクト：チェック有なら12名以下
        if (r.getConnectable()) {
            if (XXXXXXXXXXX > 12) {
                errors.add("コネクト利用時は12名までです。");
            }
        }

        // 個室有無：必須
        if (XXXXXXXXXXX == null || XXXXXXXXXXX.isEmpty()) {
            errors.add("個室有無を選択してください。");
        }

        // 利用時間：開始 < 終了
        if (XXXXXXXXXXX.compareTo(XXXXXXXXXXX) >= 0) { // ←ヒント：文字列比較
            errors.add("利用時間は開始時間が終了時間より前である必要があります。");
        }

        return errors;
    }
}
