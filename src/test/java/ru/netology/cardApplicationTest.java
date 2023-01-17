package ru.netology;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class cardApplicationTest {


    @Test
    void shouldTestv1() {
       open(" http://localhost:9999");
//        SelenideElement form = $("[data-test-id = cardApplication-form]");
        $("[data-test-id=name]input").setValue("Васильев Василий");
        $("[data-test-id=phone] input").setValue("+79998887766");
        $("[data-test-id=agreement]").click();
        $("button__text").click();
        $(".alert-success").shouldHave(Condition.exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
//
//    @Test
//    void shouldTestv2() {
//        driver.get(" http://localhost:9999");
//        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Кулёчкина Алёна");
//        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
//        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
//        driver.findElement(By.tagName("button__text")).click();
//        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        String actual = driver.findElement(By.className("order-success")).getText().trim();
//        assertEquals (expected, actual);
//    }
//
//    @Test
//    void shouldTestv3() {
//        driver.get(" http://localhost:9999");
//        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Мамин-Сибиряк Василий");
//        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
//        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
//        driver.findElement(By.tagName("button__text")).click();
//        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        String actual = driver.findElement(By.className("order-success")).getText().trim();
//        assertEquals (expected, actual);
//    }
//
//    @Test
//    void shouldTestv4() {
//        driver.get(" http://localhost:9999");
//        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ли Ия");
//        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79998887766");
//        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
//        driver.findElement(By.tagName("button__text")).click();
//        String expected = "Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
//        String actual = driver.findElement(By.className("order-success")).getText().trim();
//        assertEquals (expected, actual);
//    }
}
