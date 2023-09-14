package org.example.Pages;
import static org.example.stepDefs.Hooks.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOutPage {
    public checkOutPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="termsofservice")
    public WebElement termsOfServices;

    @FindBy(id="checkout")
    public WebElement checkOut;

    @FindBy(className = "checkout-as-guest-button")
    public WebElement checkoutasguest;

    @FindBy(id="BillingNewAddress_FirstName")
    public WebElement firstName ;

    @FindBy(id="BillingNewAddress_LastName")
    public WebElement lastName;

    @FindBy(id="BillingNewAddress_Email")
    public WebElement email;

    @FindBy(id="BillingNewAddress_Company")
    public WebElement company;

    @FindBy(id="BillingNewAddress_CountryId")
    public WebElement country;

    @FindBy(id="BillingNewAddress_StateProvinceId")
    public WebElement state;

    @FindBy(id="BillingNewAddress_City")
    public WebElement city;

    @FindBy(id="BillingNewAddress_Address1")
    public WebElement address1;

    @FindBy(id="BillingNewAddress_Address2")
    public WebElement address2;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    public WebElement zip;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    public WebElement phoneNum;

    @FindBy(id="BillingNewAddress_FaxNumber")
    public WebElement faxNumber;

    @FindBy(className="new-address-next-step-button")
    public WebElement continueButton;

    @FindBy(id="shipping-method-buttons-container")
    public WebElement continueShipping;

    @FindBy(id = "paymentmethod_1")
    public WebElement paymentMethod;

    @FindBy(className="payment-method-next-step-button")
    public WebElement contuniuePayment;

    @FindBy(id="CardholderName")
    public WebElement cardHolderNmae;

    @FindBy(id="CardNumber")
    public WebElement cardNumber;

    @FindBy(id="ExpireYear")
    public WebElement expireYear;

    @FindBy(id="CardCode")
    public WebElement cardCode;

    @FindBy(className = "payment-info-next-step-button")
    public WebElement continueToSave;

    @FindBy(className = "confirm-order-next-step-button")
    public WebElement confirmButton;
    @FindBy(className = "details-link")
    public WebElement orderDetailes;


}
