package org.example.stepDefs;
import static org.example.stepDefs.Hooks.driver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.CartPage;
import org.example.Pages.checkOutPage;
import org.example.Pages.homePage;


public class CheckOut {
    homePage home = new homePage();
    CartPage cart = new CartPage();
    checkOutPage check = new checkOutPage();

    @Given("The guest user navigate to the shopping cart")
    public void userNavigateToTheShoppingCart(){
        home.AddToCart.click();
        cart.ramOptions.sendKeys("2 GB");
        cart.hddOptions.click();
        cart.ToCheckout.click();
        cart.shoppingCart.click();

    }

    @When("The guest user agrees to the terms and conditions and click on the Check out button")
    public void theGuestUserAgreesToTheTermsAndConditionsAndClickOnTheCheckOutButton() {
        check.termsOfServices.click();
        check.checkOut.click();
        check.checkoutasguest.click();
    }

    @And("The guest user add his details: First and Last name, Email, Company")
    public void theGuestUserAddHisDetailsFirstAndLastNameEmailCompany() {
        check.firstName.sendKeys("Aya");
        check.lastName.sendKeys("Hamdy");
        check.email.sendKeys("aya@gmail.com");
        check.company.sendKeys("Amit");
    }

    @And("The guest user select the country and state")
    public void theGuestUserSelectTheCountryAndState() {
        check.country.sendKeys("Egypt");
        check.country.sendKeys("Other");
    }

    @And("The guest user add city and address details")
    public void theGuestUserAddCityAndAddressDetails() {
        check.city.sendKeys("Cairo");
        check.address1.sendKeys("Egypt");
        check.address2.sendKeys("Egypt");
    }

    @And("The user adds Phone number and Fax")
    public void theUserAddsPhoneNumberAndFax() {
        check.zip.sendKeys("1122");
        check.phoneNum.sendKeys("1006037");
        check.faxNumber.sendKeys("11223");
    }

    @And("The user clicks on Continue")
    public void theUserClicksOnContinue() {
        check.continueButton.click();
    }

    @And("The user selects the shipping method and clicks on Continue")
    public void theUserSelectsTheShippingMethodAndClicksOnContinue() {
        check.continueShipping.click();
    }

    @And("The user selects the payment method and clicks on Continue")
    public void theUserSelectsThePaymentMethodAndClicksOnContinue() {
        check.paymentMethod.click();
        check.contuniuePayment.click();
    }

    @And("The user add the payment method details")
    public void theUserAddThePaymentMethodDetails() {
        check.cardHolderNmae.sendKeys("Aya Hamdy");
        check.cardNumber.sendKeys("5555555555554444");
        check.expireYear.sendKeys("2026");
        check.cardCode.sendKeys("1234");
        check.continueToSave.click();

    }

    @And("The guest user clicks on Confirm")
    public void theGuestUserClicksOnConfirm() {

        check.confirmButton.click();
    }

    @Then("The order is confirmed and the user can navigate to order details")
    public void theOrderIsConfirmedAndTheUserCanNavigateToOrderDetails() {

        String actualMessage = check.orderDetailes.getText();
        if (actualMessage.equals("Click here for order details.")){
            System.out.println("Order Placed Successfully.");
        }
        else
        {
            System.out.println("Something went wrong.");
        }


    }
}
