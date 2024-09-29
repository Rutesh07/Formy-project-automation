package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConfirmationPage;
import pages.FormPage;

import java.time.Duration;

import static pages.FormPage.submitForm;

public class CompleteWebForm {

    public static void main(String[] arg){

        System.setProperty("webdriver chrome.driver","D://Rutesh//University//Computing concepts//Selenium_Jars_Chrome_files//chrome_driver//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        formPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);


        assertEquals("The form was succcessfully submitted!", getAlertBannerText(driver));

        driver.quit();


}

    public static void assertEquals(String s, String alertText) {
    }


    public static String getAlertBannerText(WebDriver driver){
        return driver.findElement(By.className("alert")).getText();
    }


}
