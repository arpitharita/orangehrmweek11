package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class ForgotPasswordTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){openbrowser(baseUrl);}

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //* Verify the text ‘Forgot Your Password?’
        String actualTest = getTextFromElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedTest = "Forgot your password?";
        Assert.assertEquals(expectedTest,actualTest);

        //* click on the ‘Forgot your password’ link
        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']"));


    }
}
