package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        // Deschidem un browser
        driver = new EdgeDriver();
        // Accesam un URL
        driver.get("https://demoqa.com/webtables");
        // Facem browserul maximize
        driver.manage().window().maximize();


        // Definim un element
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        addElement.click();
//
//
        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Razvan";
        firstNameElement.sendKeys(firstNameValue);


        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "Dascalu";
        lastNameElement.sendKeys(lastNameValue);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String emailValue = "razvan@example.com";
        emailElement.sendKeys(emailValue);

        WebElement ageElement = driver.findElement(By.id("age"));
        String ageValue = "30";
        ageElement.sendKeys(ageValue);

        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salaryValue = "80000";
        salaryElement.sendKeys(salaryValue);

        WebElement departmentElement = driver.findElement(By.id("department"));
        String departmentValue = "testare";
        departmentElement.sendKeys(departmentValue);

        WebElement submitElement = driver.findElement(By.id("submit"));
        submitElement.click();


        //function edit
        WebElement editElement=driver.findElement(By.id("edit-record-4"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", editElement);

            WebElement editFirstNameElement = driver.findElement(By.id("firstName"));
            String editFirstNameValue = "Alin";
            editFirstNameElement.clear();
            editFirstNameElement.sendKeys(editFirstNameValue);

            WebElement editLastNameElement = driver.findElement(By.id("lastName"));
            String editLastNameValue = "Dascalu";
            editLastNameElement.clear();
            editLastNameElement.sendKeys(editLastNameValue);

            WebElement editEmailElement = driver.findElement(By.id("userEmail"));
            String editEmailValue = "alin@example.com";
            editEmailElement.clear();
            editEmailElement.sendKeys(editEmailValue);

            WebElement editAgeElement = driver.findElement(By.id("age"));
            String editAgeValue = "31";
            editAgeElement.clear();
            editAgeElement.sendKeys(editAgeValue);

            WebElement editSalaryElement = driver.findElement(By.id("salary"));
            String editSalaryValue = "9000";
            editSalaryElement.clear();
            editSalaryElement.sendKeys(editSalaryValue);

            WebElement editDepartmentElement = driver.findElement(By.id("department"));
            String editDepartmentValue = "testing";
            editDepartmentElement.clear();
            editDepartmentElement.sendKeys(editDepartmentValue);

            WebElement editSubmitElement = driver.findElement(By.id("submit"));
            editSubmitElement.click();




    }
    //div[@class='rt-tbody']/div/div[@class = 'rt-tr -odd' or @class = 'rt-tr -even']

}
