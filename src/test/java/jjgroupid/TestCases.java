package jjgroupid;
//import org.junit.BeforeClass;

// import org.testng.annotations.Parameters;
//import org.junit.BeforeClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import org.testng.Assert;

public class TestCases extends BaseClass {
   

    @Test(priority = 1)

    public void login() {
        BaseClass.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        BaseClass.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        BaseClass.driver.findElement(By.id("login-button")).click();
        String actual = driver.getTitle();
        String expected = "Swag Labs";
        Assert.assertEquals(actual, expected);
        System.out.println("Login Successful");
     
    }

    @Test(priority = 2)
    public void invalidTitle() {
        BaseClass.driver.findElement(By.id("user-name")).sendKeys("standard_user");
        BaseClass.driver.findElement(By.id("password")).sendKeys("secret_sauce");
        BaseClass.driver.findElement(By.id("login-button")).click();
        String actual = driver.getTitle();
        String expected = "Shopping cart";
        System.out.println("Actual Titla is:" + actual);
        Assert.assertNotEquals(actual, expected, "The title doesnot match");
      
    }

@Test
    public void testWebElements(){

        // String pageSource = driver.getPageSource();
        // System.out.println(pageSource);
        List <WebElement> elements =  BaseClass.driver.findElements(By.className("inventory_item_label"));/*react-burger-menu-btn */
        System.out.println("Number of elements :" +elements.size());
        System.out.println("index of the elements:" +elements.get(0));

// for(int i=0; i<elements.size();i++){
//     System.out.println("WebElement Text: " +elements.get(i).getAttribute("value"));
// }

BaseClass.driver.close();
    }

}
