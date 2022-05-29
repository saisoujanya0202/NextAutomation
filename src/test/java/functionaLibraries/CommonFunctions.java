package functionaLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public static WebDriver driver;

    public void openBrowser(){

     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get("https://www.next.co.uk/");

    }

    public void closeBrowser(){




    }


}
