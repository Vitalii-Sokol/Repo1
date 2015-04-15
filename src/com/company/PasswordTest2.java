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

public class PasswordTest2 {

    public WebDriver driver;
    private static String value;
    private String getMaxValue;

    @Before
    public void NewBrowser() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver
        driver= new ChromeDriver(); //open chrome browser
        driver.get("http://angel.net/~nic/passwd.current.html"); //open  link
    }
    public void NewPassword(String pwd)
    {
        WebElement a = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        a.sendKeys(pwd);//populate master password
    }
    public void generate ()
    {
        WebElement b = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        b.click();
    }
    public void getNewPwd ()
    {
        WebElement c = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
        value = c.getAttribute("value");
    }
    public void getNewSiteName (String siteName)
    {
        WebElement d = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        d.sendKeys(siteName);
    }

    public void getGenerateName ()
    {
        WebElement btnGen = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        value = btnGen.getAttribute("value");
    }

    public void getMaxValue ()
    {
        getMaxValue = "";
            for (int i = 0; i < 201; i = i + 1)

            {
                getMaxValue = getMaxValue + "1";
            }

    }
@Test
    public void test1NewSite() throws InterruptedException
    {
        NewPassword("aaa");
        getNewSiteName("ccc");//new site name
        generate();
        getNewPwd();
        String expRes = "3KTaYO5qUDMbw@1a";
        Assert.assertEquals(expRes, value);
    }

    @Test
    public void test2NullSite() throws InterruptedException
    {
        NewPassword("ddd");
        getNewSiteName("");//null value
        generate();
        getNewPwd();
        String expRes = "VQhVEmdi9LYyr@1a";
        Assert.assertEquals(expRes, value);
    }

    @Test
    public void test3GenerateWithNull() throws InterruptedException
    {
        NewPassword("");// null password
        getNewSiteName("");//null value
        generate();
        getNewPwd();
        String expRes = "BaefBs8/Z/cm2@1a";
        Assert.assertEquals(expRes, value);
    }
    @Test
    public void test4CheckGenerateName() throws InterruptedException
    {
        getGenerateName();
        String expRes = "Generate";
        Assert.assertEquals(expRes, value);
    }

    @Test
    public void test5CheckSpecSymbols() throws InterruptedException
    {
        NewPassword("/';*&#$@");
        getNewSiteName("/';*&#$@");//null value
        generate();
        getNewPwd();
        String expRes = "ZNn5HmerIYX5s@1a";
        Assert.assertEquals(expRes, value);
    }

    @Test
    public void test6getMaxValue() throws InterruptedException
    {
        getMaxValue();
        NewPassword(getMaxValue);
        getNewSiteName("");//null value
        generate();
        getNewPwd();
        String expRes = "";
        Assert.assertEquals(expRes, value);
    }
    @After
    public void quit() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}
