package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Password {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver",
                "C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver

        WebDriver Browsedriver = new ChromeDriver(); //open chrome browser
        Browsedriver.manage().window().maximize();  //expand to full window
        Browsedriver.get("http://angel.net/~nic/passwd.current.html"); //open  link

        WebElement a = Browsedriver.findElement(By.name("master"));
        a.sendKeys("Sokol");//populate master password

        WebElement b = Browsedriver.findElement(By.name("site"));
        b.sendKeys("gmail"); //populate site name
        b.sendKeys(Keys.ENTER);

        WebElement c = Browsedriver.findElement(By.name("password"));
        System.out.println(c.getAttribute("value"));//show generated password
    }

}
