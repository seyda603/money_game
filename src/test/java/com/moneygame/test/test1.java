package com.moneygame.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulity.WebDriverFactory;

public class test1 {
    WebDriver driver;
@BeforeMethod
public void a(){
driver= WebDriverFactory.getDriver("chrome");
driver.manage().window().maximize();
driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
}
    @Test
    public void test2() throws InterruptedException {
        WebElement nameBox=driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("şeyda");
        WebElement surnameBox=driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("aydın");
        Thread.sleep(2000);

    }
    @AfterMethod
    public void tearDown(){
driver.close();
    }
}
