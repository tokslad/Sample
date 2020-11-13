package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Hooks;

public class SamplePage {
    public WebDriver driver;

    By gettingStarted = By.xpath("//a[@href=\"/GettingStarted/\"]");
    By backEditor = By.xpath("(//a[@class=\"btn btn-default\"])[1]");
    By landingPage = By.xpath("//*[@id=\"login-button\"]");


    public SamplePage(Hooks hooks) {
        this.driver = hooks.getDriver();
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void clickOnGettingStarted(){
        driver.findElement(gettingStarted).click();
    }

    public void clickOnBackToEditor(){
        driver.findElement(backEditor).click();
    }

    public boolean isLandingDisplayed(){
        return driver.findElement(landingPage).isDisplayed();
    }



}
