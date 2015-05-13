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

public class PasswordTest2withShortXPATH {

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
        //WebElement a = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
       // <input name="master" type="password" tabindex="1">
        WebElement a = driver.findElement(By.xpath("//*[@name = 'master' and @type = 'password']"));
        a.sendKeys(pwd);//populate master password
    }
    public void generate ()
    {
        //WebElement b = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        //<input type="submit" value="Generate">
        WebElement b = driver.findElement(By.xpath("//*[@type = 'submit' and  @value = 'Generate']"));
        b.click();
    }
    public void getNewPwd ()
    {
        //WebElement c = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input"));
        WebElement c = driver.findElement(By.xpath("//*[@name = 'password']"));
       // <input name="password" autocorrect="off" autocapitalize="off" tabindex="3">
        value = c.getAttribute("value");
    }
    public void getNewSiteName (String siteName)
    {
        //WebElement d = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        //<input name="site" autocorrect="off" autocapitalize="off" tabindex="2">
        WebElement d = driver.findElement(By.xpath("//*[@name = 'site']"));
        d.sendKeys(siteName);
    }

    public void getGenerateName ()
    {
        //WebElement btnGen = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        WebElement btnGen = driver.findElement(By.xpath("//*[@type = 'submit' and  @value = 'Generate']"));
       // <input type="submit" value="Generate">
        value = btnGen.getAttribute("value");
    }

/*
    public void getLabelSiteName (String LabelSiteName)

   // WebElement lable = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[1]"));
   WebElement labe = driver.findElement(By.xpath("[//*td() = 'Site name']"));
    value = labe.getAttribute("Site name");
*/

/*



    {
        //WebElement btnGen = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input"));
        WebElement btnGen = driver.findElement(By.xpath("//*[@type = 'submit' and  @value = 'Generate']"));
        // <input type="submit" value="Generate">
        value = btnGen.getAttribute("value");
    }
*/
    public void getMaxValue ()
    {
        getMaxValue = "";
        for (int i = 0; i < 201; i = i + 1)

        {
            getMaxValue = getMaxValue + "1";
        }

    }

    @Test
    public void testSiteName(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Site name']")));
        WebElement td = driver.findElement(By.xpath("//td[text()='Site name']"));
        String title = td.getText();
        Assert.assertEquals("Test","Site name", title);
    }

    @Test
    public void testLabelSiteName(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Your master password']")));
        WebElement td = driver.findElement(By.xpath("//td[text()='Site name']"));
        String title = td.getText();
        //String title = list.get(5).getText();
        Assert.assertEquals("Test","Site name", title);
    }
/*
    @Test
    public void testLabelGeneratedPassword(){
        //List<WebElement> list = new ArrayList<WebElement>(h.findElements(By.xpath("td[text()='Your master password']")));
        WebElement td = driver.findElement(By.xpath("//td[text()='Generated password']"));
        String title = td.getText();
        //String title = list.get(5).getText();
        Assert.assertEquals("Test","Generated password", title);
    }
*/
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
        String expRes = "es/ocm3ocikwb@1a";
        Assert.assertEquals(expRes, value);
    }
    @After
    public void quit() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }
}
