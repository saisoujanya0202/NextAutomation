package test;

import functionaLibraries.CommonFunctions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavouriteTest extends CommonFunctions {

    @Before
    public void beforeTest() {

        openBrowser();


    }

@Test
    public void verifyFavouritesWithNoPdt() {

       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closePopUp = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        wait.until(ExpectedConditions.visibilityOf(closePopUp));
    closePopUp.click(); */

    driver.manage().window().maximize();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"))));
    driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"))));


    Actions actions = new Actions(driver);
//    WebElement menMenu = driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"));
    actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div"))).build().perform();

    System.out.println(driver.findElement(By.xpath("//*[@id=\"meganav-link-1\"]/div")).getText());



    }

    public void verifyFavouritesWithPdt() {


    }

    @After
    public void afterTest() {


    }


}
