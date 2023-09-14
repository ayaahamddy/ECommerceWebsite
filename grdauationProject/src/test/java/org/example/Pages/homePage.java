package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class homePage {

    public homePage(){
        PageFactory.initElements(driver,this);

    }

    @FindBy(className = "ico-register")
    public WebElement registerTab;
    @FindBy(id="gender-female")
    public WebElement gender;

    @FindBy(className = "ico-login")
    public WebElement loginTab;

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement MacBook;

    @FindBy(className = "product-box-add-to-cart-button")
    public WebElement AddToCart;



}
