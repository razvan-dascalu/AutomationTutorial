package tests;

import org.testng.annotations.Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class TabWindowText {

    public WebDriver driver;

    @Test
    public void metodaTest() {
        // deschidem un browser
        driver = new EdgeDriver();
        //accesam un url
        driver.get("https://demoqa.com/");
        //facem browserul maximise
        driver.manage().window().maximize();

        WebElement alertFrameWindowMenu=driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Window']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",alertFrameWindowMenu);







        System.out.println("Url-ul paginii curente este" + driver.getCurrentUrl("demoqa.com/sample"));
        List<String> tabsList=new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabsList.get(1));


        driver.quit();



    }


}
