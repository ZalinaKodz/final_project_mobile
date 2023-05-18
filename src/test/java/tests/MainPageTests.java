package tests;


import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;

import static io.qameta.allure.Allure.step;



public class MainPageTests extends TestBase{
    @Test
    @DisplayName("Login in Todoist")
    public void testLogin() {
        step("Логин пользователя", () -> {
            $(AppiumBy.id("com.todoist:id/more_signin_options")).click();
           $(AppiumBy.id("com.todoist:id/email_login")).click();
           $(AppiumBy.id("com.google.android.gms:id/default_credential_avatar")).click();
           $(AppiumBy.id("com.todoist:id/toolbar")).shouldHave(Condition.exist);
        });
    }

    @Test
    @DisplayName("Menu")
    public void testSettings() {
        testLogin();
        step("Создаем задачу", () -> {
            $(AppiumBy.className("android.widget.ImageButton")).click();
            $(AppiumBy.id("com.todoist:id/profile_settings")).click();
            $(AppiumBy.id("android:id/title")).shouldHave(Condition.text("Navigation menu NEW")).click();
            $(AppiumBy.id("com.todoist:id/quick_add_item")).click();
        });
    }

    @Test
    @DisplayName("Создание новой задачи")
    public void taskCreationTest() {
        step("Логин", () -> {
            $(AppiumBy.id("com.todoist:id/more_signin_options")).click();
            $(AppiumBy.id("com.todoist:id/email_login")).click();
            $(AppiumBy.id("com.google.android.gms:id/default_credential_avatar")).click();
            $(AppiumBy.id("com.todoist:id/toolbar")).shouldHave(Condition.exist);
        });

        step("Создаем задачу", () -> {
            $(AppiumBy.id("com.todoist:id/fab")).click();
            $(AppiumBy.id("android:id/message")).sendKeys("task");
            $(AppiumBy.id("com.todoist:id/description")).sendKeys("description");
            $(AppiumBy.id("android:id/button1")).click();
            $(AppiumBy.id("com.todoist:id/quick_add_item")).click();
        });
        step("Проверяем, что задача создана", () -> {
            $(AppiumBy.id("com.todoist:id/text")).shouldHave(Condition.text("task"));
        });
        step("Добавляем лейбл", () -> {
            $(AppiumBy.id("com.todoist:id/text")).click();
            $(AppiumBy.id("com.todoist:id/design_bottom_sheet")).click();
            $(AppiumBy.id("android:id/message")).sendKeys("message");
            $(AppiumBy.id("com.todoist:id/done")).click();
            $(AppiumBy.id("com.todoist:id/touch_outside")).click();
        });
        step("Проверяем, что у задачи есть созданный лейбл", () -> {
            $(AppiumBy.id("com.todoist:id/labels")).shouldHave(Condition.text("message"));
        });
        step("Отмечаем, что задача сделана", () -> {
            $(AppiumBy.id("com.todoist:id/checkmark")).click();
        });
        step("Проверяем, что задача исчезла из списка задач на Сегодня", () -> {
            $(AppiumBy.id("com.todoist:id/item")).shouldNot(Condition.exist);
        });
    }
}
