package com.ilcarro.qa14;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenHomePageTest extends TestBase{

    @Test
    public void homePageTest() {
        System.out.println("FindCarForm: " + isElementPresent(By
                .cssSelector(".Main_mainpage__find_your_car__AHLkw")));

        //.Main_mainpage__find_your_car__AHLkw
    }

}