package org.example.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;
public class CartPage {
    public CartPage(){
        PageFactory.initElements(driver,this);

    }

    @FindBy(id="product_enteredQuantity_4")
    public WebElement quantity;
    @FindBy(id = "add-to-cart-button-4")
    public WebElement addCartButton;

    @FindBy(id="topcartlink")
    public WebElement topCart;

    @FindBy(className="qty-input")
    public WebElement updatedQuentity ;

    @FindBy(id="updatecart")
    public WebElement updateButton;

    @FindBy(id="product_attribute_2")
    public WebElement ramOptions;

    @FindBy(id="product_attribute_3_6")
    public WebElement hddOptions;
    @FindBy(id="add-to-cart-button-1")
    public WebElement ToCheckout ;
    @FindBy(id="topcartlink")
    public WebElement shoppingCart;









}
