
package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.*;

public class AddToCart {

    homePage home = new homePage();
    CartPage cart = new CartPage();
    loginPage l = new loginPage();
    registerPage r = new registerPage();


    @Given("user log in and  selects a product from his list")
    public void userLogInAndSelectsAProductFromHisList() {
        home.loginTab.click();
        l.email.sendKeys(SignUp.Email);
        l.password.sendKeys(SignUp.password);
        l.RememberMe.click();
        l.loginButton.click();
        home.MacBook.click();


    }


    @And("choose it's color and size and customer phase")
    public void chooseItSColorAndSizeAndCustomerPhase() {
        cart.quantity.sendKeys("10");
        cart.addCartButton.click();

    }

    @And("Add it to the cart")
    public void addItToTheCart() {

        cart.topCart.click();
    }

    @And("update the quantity of the product in the cart")
    public void updateTheQuantityOfTheProductInTheCart() {
        cart.updatedQuentity.sendKeys("15");
        cart.updateButton.click();

    }

    @Then("product is ready to check out.")
    public void productIsReadyToCheckOut() {
    }


}
