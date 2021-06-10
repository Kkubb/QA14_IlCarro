package com.ilcarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://ilcarro-dev-v1.firebaseapp.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public boolean isFindCarFormPresent() {     //boolean cause we need a return (true or false)
            return wd.findElements(By.cssSelector(".Main_mainpage__find_your_car__AHLkw")).size()>0;
    }

    public boolean isElementPresent(By locator) {
            try {
                wd.findElement(locator);
                return true;
            } catch (NoSuchElementException ex) {
                return false;
            }

    }

    @AfterMethod(enabled = false)
        public void tearDown() {
            wd.quit();
        }
}
