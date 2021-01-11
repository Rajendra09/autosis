package pageObjects;

import org.openqa.selenium.By;

import helper.PageObject;

public class LoginPortalPage extends PageObject {
    By UserNametxtfield = By.xpath("//input[@name='email']");
    By Passwordtxtfield = By.xpath("//input[@name='password']");
    By LoginButton = By.xpath("//input[@name='login']");

    public void setUserName(String UserName){

        element(UserNametxtfield).sendKeys(UserName);
    }
    public void setpassword(String Password ){

        element(Passwordtxtfield).sendKeys(Password);
    }
    public void ClickOnLoginButton(){

        element(LoginButton).click();
    }

}
