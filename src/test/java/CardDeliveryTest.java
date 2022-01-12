package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class CardDeliveryTest {

    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @BeforeEach



    @Test
    public void shouldSendFormWithADateIn4Days() {
        String planningDate = generateDate(4);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Москва");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }
    @Test
    public void shouldSendFormWithADateIn3Days() {
        String planningDate = generateDate(3);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Москва");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }
    @Test
    public void shouldSendFormWithADateIn10Days() {
        String planningDate = generateDate(10);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Москва");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }
    @Test
    public void shouldSendFormWithANameWithHyphen() {
        String planningDate = generateDate(3);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Москва");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна-Виктория");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }
    @Test
    public void shouldSendFormWithACityWithHyphen() {
        String planningDate = generateDate(3);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Петропавловск-Камчатский");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна-Виктория");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }
    @Test
    public void shouldSendFormWithACityWithASpace() {
        String planningDate = generateDate(3);
        open("http://localhost:9999");
        $("[data-test-id='city'] .input__control").setValue("Нижний Новгород");
        $("[data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id='date'] .input__control").setValue(planningDate);
        $x("//input[@name='name']").setValue("Осипова Татьяна-Виктория");
        $x("//input[@name='phone']").setValue("+79218671111");
        $("[data-test-id='agreement'] .checkbox__box").click();
        $(".button__text").click();
        $("[data-test-id='notification']")
                .shouldBe(visible, Duration.ofSeconds(15))
                .shouldHave(text("Встреча успешно забронирована на " + planningDate));
    }

}