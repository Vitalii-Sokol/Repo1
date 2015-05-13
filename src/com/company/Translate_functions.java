package com.company;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class Translate_functions {
    public static String field;
    public WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver","C:/test/chromedriver_win32/chromedriver.exe");
        Translate_Path.driver = new ChromeDriver();
        Translate_Path.driver.get(Translate_Path.Page);
    }

    public static void sendKeys(String text)
    {
        WebElement myKey = Translate_Path.driver.findElement(By.xpath("//*[@id=\"source\"]"));
        myKey.sendKeys(text);
    }

    public void btnLanguage ()
    {
        WebElement b = driver.findElement(By.xpath("//*[@id=\"gt-sl-gms\"]"));
        b.click();
    }


}
