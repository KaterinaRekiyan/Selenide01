package ru.netology;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardApplicationTest {

    @BeforeEach
    void setUp() {
        open("http://localhost:9999");
    }

    @Test
    void shouldTestv1() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    void shouldTestv2() {
        $("[data-test-id=name] input").setValue("Кулёчкина Алёна");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

    @Test
    void shouldTestv3() {
        $("[data-test-id=name] input").setValue("Мамин-Сибиряк Василий");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    void shouldTestv4() {
        $("[data-test-id=name] input").setValue("Я");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }

    @Test
    void shouldTestv5() {
        $("[data-test-id=name] input").setValue("James Ivanovich");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }

    @Test
    void shouldTestv6() {
        $("[data-test-id=name] input").setValue("Лук'янов Д’Артаньян");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }

    @Test
    void shouldTestv7() {
        $("[data-test-id=name] input").setValue("Васильева Ан@стасия");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }

    @Test
    void shouldTestv8() {
        $("[data-test-id=name] input").setValue("Почтальон Пе4кин");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
    }

    @Test
    void shouldTestv9() {
        $("[data-test-id=name] input").setValue("");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='name'].input_invalid .input__sub").shouldHave(exactText("Поле обязательно для заполнения"));
    }

    @Test
    void shouldTestv10() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Поле обязательно для заполнения"));
    }

    @Test
    void shouldTestv11() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("89998887766");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    void shouldTestv12() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("+7999888776");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    void shouldTestv13() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("+799988877665");
        $("[data-test-id=agreement]").click();
        $("button").click();
        $("[data-test-id='phone'].input_invalid .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
    }

    @Test
    void shouldTestv14() {
        $("[data-test-id=name] input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("button").click();
        $("[data-test-id=agreement]").shouldHave(exactText("Я соглашаюсь с условиями обработки и использования моих персональных данных и разрешаю сделать запрос в бюро кредитных историй"));
    }
}
