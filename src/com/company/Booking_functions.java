package com.company;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Booking_functions {

    public static WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException

    {
        System.setProperty("webdriver.chrome.driver", "C:/test/chromedriver_win32/chromedriver.exe");
        Booking_Path.driver = new ChromeDriver();
        Booking_Path.driver.get(Booking_Path.Page);
    }


    public static void sendKeys(String text)
    {
        WebElement myKey = Booking_Path.driver.findElement(By.xpath("//*[@id=\"station_from\"]/input"));
        myKey.sendKeys(text);
    }


    public static void sendClick(String sendClick) {
        {
            WebElement myClick = Booking_Path.driver.findElement(By.xpath("//*[.='Kyiv']"));
            myClick.click();
        }
    }

}
