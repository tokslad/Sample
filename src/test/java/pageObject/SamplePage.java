package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Hooks;

public class SamplePage {
    public WebDriver driver;

    By gettingStarted = By.xpath("//a[@href=\"/GettingStarted/\"]");
    By backEditor = By.xpath("(//a[@class=\"btn btn-default\"])[1]");
    By landingPageOutput = By.xpath("//*[@id=\"output\"]");


    public SamplePage(Hooks hooks) {
        this.driver = hooks.getDriver();
    }

    public void navigateToUrl(String url){
        driver.navigate().to(url);
    }

    public void clickOnGettingStarted(){
        driver.findElement(gettingStarted).click();
    }

    public void clickOnBackToEditor() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(backEditor).click();
    }

    public boolean isLandingPageOutputDisplayed(){
        return driver.findElement(landingPageOutput).isDisplayed();
    }

    public String getLandingPageOutputText(){
        return driver.findElement(landingPageOutput).getText();
    }



}
