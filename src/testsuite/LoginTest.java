package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class LoginTest extends Utility {


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openbrowser(baseUrl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //* Enter “Admin” username
        sendKeysToElement(By.xpath("//input[@name='username']"),"Admin");

        //* Enter “admin123 password
        sendKeysToElement(By.xpath("//input[@name='password']"),"admin123");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@type='submit']"));

        //* Verify the ‘Welcome’ text is display
        String actualTest = getTextFromElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        String expectedTest = "Paul Collings";
        Assert.assertEquals(expectedTest,actualTest);
    }
    @After
    public void closebrowser(){

      //  closebrowser();
    }
}