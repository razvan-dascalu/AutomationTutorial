import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class TabMethods {
    public WebDriver driver;

    public TabMethods(WebDriver driver){
        this.driver = driver;
    }

    public void switchSpecificTab(int index){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(index));
    }

    public void closeCurrentTab(){

    }


}
