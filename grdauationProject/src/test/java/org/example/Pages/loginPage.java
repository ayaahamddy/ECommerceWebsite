package org.example.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="Email")
    public WebElement email;

    @FindBy(id ="Password")
    public WebElement password;

    @FindBy(className = "login-button")
    public WebElement loginButton;

    @FindBy(id= "RememberMe")
    public WebElement RememberMe;




}
