package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base {
@Test
public void verifyTheUserIsAbleToLoginWithValidCredentials() 
{
	String username="admin";
	String password="admin";
	WebElement usernamefield=driver.findElement(By.name("username"));
    usernamefield.sendKeys(username);
	
    WebElement passwordfield=driver.findElement(By.name("password"));
	passwordfield.sendKeys(password);
   
	WebElement signinbutton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	signinbutton.click();
}
	
@Test
public void verifyTheUserIsAbleToLoginWithInValidPasswordAndValidUsername() 
{
	String username="admin";
	String password="admin123";
	WebElement usernamefield=driver.findElement(By.name("username"));
    usernamefield.sendKeys(username);
	
    WebElement passwordfield=driver.findElement(By.name("password"));
	passwordfield.sendKeys(password);
   
	WebElement signinbutton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	signinbutton.click();
	}
@Test	
public void verifyTheUserIsAbleToLoginWithValidPasswordAndInValidUsername() 
{
	String username="adminsss";
	String password="admin";
	WebElement usernamefield=driver.findElement(By.name("username"));
    usernamefield.sendKeys(username);
	
    WebElement passwordfield=driver.findElement(By.name("password"));
	passwordfield.sendKeys(password);
   
	WebElement signinbutton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	signinbutton.click();
	}
@Test
public void verifyTheUserIsAbleToLoginWithInValidPasswordAndInValidUsername() 
{
	String username="adminsss1";
	String password="567admin";
	WebElement usernamefield=driver.findElement(By.name("username"));
    usernamefield.sendKeys(username);
	
    WebElement passwordfield=driver.findElement(By.name("password"));
	passwordfield.sendKeys(password);
   
	WebElement signinbutton=driver.findElement(By.xpath("//button[@class='btn btn-dark btn-block']"));
	signinbutton.click();
	}



}
	
	
	
	

