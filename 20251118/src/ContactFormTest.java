// ファイル名: ContactFormTest.java
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactFormTest {

    // --------------------------------------------------
    // 基本バリデーション（正常系・単一異常系）
    // --------------------------------------------------

    @Test
    void testValidForm() {
        ContactForm form = new ContactForm("Taro", "taro@example.com", "こんにちは");
        // 正常系のみ正解
        assertTrue(form.isValid(), "すべて正しい入力の場合は有効");
    }

    @Test
    void testBlankNameValidation() {
        ContactForm form = new ContactForm("", "user@example.com", "テスト");
        // 名前が空の場合は無効
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testInvalidEmailValidation() {
        ContactForm form = new ContactForm("Taro", "invalid-email", "テスト");
        // メールに @ が含まれない場合は無効
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testBlankMessageValidation() {
        ContactForm form = new ContactForm("Taro", "taro@example.com", "");
        // メッセージが空の場合は無効
        assertEquals(XXXXXXXXXX, form.isValid());
    }


    // --------------------------------------------------
    // バリエーション追加（複合異常・論理演算）
    // --------------------------------------------------

    @Test
    void testNameBlankAndInvalidEmail() {
        ContactForm form = new ContactForm("", "invalid-email", "メッセージ");
        // 複合異常：名前空 + メール不正
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testNameBlankAndMessageBlank() {
        ContactForm form = new ContactForm("", "valid@example.com", "");
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testEmailBlank() {
        ContactForm form = new ContactForm("Taro", "", "メッセージ");
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testEmailStartsWithAt() {
        ContactForm form = new ContactForm("Taro", "@example.com", "メッセージ");
        // 簡易チェック上、有効
        assertTrue(form.isValid(), "メールが @ で始まっても有効");
    }

    @Test
    void testEmailEndsWithAt() {
        ContactForm form = new ContactForm("Taro", "example@", "メッセージ");
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testEmailContainsSpace() {
        ContactForm form = new ContactForm("Taro", "tar o@example.com", "メッセージ");
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    @Test
    void testMessageOnlySpaces() {
        ContactForm form = new ContactForm("Taro", "taro@example.com", "   ");
        assertEquals(XXXXXXXXXX, form.isValid());
    }

    // AND / OR 条件例
    @Test
    void testAndCondition() {
        ContactForm form = new ContactForm("Hanako", "hanako@example.com", "OK");
        boolean expected = XXXXXXXXXX && XXXXXXXXXX;
        assertEquals(expected, form.isValid());
    }

    @Test
    void testOrCondition() {
        ContactForm form = new ContactForm("", "invalid-email", "メッセージ");
        boolean expected = XXXXXXXXXX || XXXXXXXXXX;
        assertTrue(expected);
    }
}
