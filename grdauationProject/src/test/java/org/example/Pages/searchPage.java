package org.example.Pages;
import static org.example.stepDefs.Hooks.driver;
import org.example.Pages.searchPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

    public searchPage(){
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "advs")
    public WebElement advancedcheck;

    @FindBy(id = "mid")
    public WebElement manfacturer;

    @FindBy(className = "search-button")
    public WebElement serachButton;

    @FindBy(className = "actual-price")
    public WebElement actualPrice;

}
