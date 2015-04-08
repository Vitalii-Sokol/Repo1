package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PasswordTest {
    @Test
    public void main() throws InterruptedException
    {
        String expectedResult = "hR8tPLAtV9fZj@1a";
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
        Assert.assertEquals("Password Generator:", expectedResult, c.getAttribute("value"));
    }
    @Test
    public void main1() throws InterruptedException
    {
        String expectedResult1 = "Password generator";
        System.setProperty("webdriver.chrome.driver",
                "C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver
        WebDriver Browsedriver = new ChromeDriver(); //open chrome browser
        Browsedriver.manage().window().maximize();  //expand to full window
        Browsedriver.get("http://angel.net/~nic/passwd.current.html"); //open  link
       //expectedResult1 = Browsedriver.getTitle();
        Assert.assertEquals("Password generator", Browsedriver.getTitle());
    }
    @Test
    public void main2() throws InterruptedException
    {
        String expectedResult2 = "Generate";
        System.setProperty("webdriver.chrome.driver",
                "C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver
        WebDriver Browsedriver = new ChromeDriver(); //open chrome browser
        Browsedriver.manage().window().maximize();  //expand to full window
        Browsedriver.get("http://angel.net/~nic/passwd.current.html"); //open  link
        WebElement e = Browsedriver.findElements(By.tagName("input")).get(2);
        Assert.assertEquals("Generate", e.getAttribute("value"));

    }

}
