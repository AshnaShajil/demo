package testscript;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;


public class ManageNewsTest extends Base{
	public  HomePage homepage;
	public ManageNewsPage managenewspage;
	@Test
	public void verifyTheUserIsAbleToAddNews() throws IOException 
	{
		String username=ExcelUtility.readStringData(1,0,"LoginPage");
		String password=ExcelUtility.readStringData(1,1,"LoginPage");
		String news=ExcelUtility.readStringData(0, 0, "Managenews");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		//loginpage.clickOnSignInButton();
		homepage=loginpage.clickOnSignInButton();
		
		
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		//managenewspage.manageNewsMoreInfo();
		managenewspage=homepage.manageNewsMoreInfo();
		managenewspage.clickNewButton().textInTheNewsField(news).ClickSaveButton();
		//managenewspage.textInTheNewsField(news);
		//managenewspage.ClickSaveButton();
		Boolean newsalert=managenewspage.alertIsDisplayed();
    	Assert.assertTrue(newsalert);
	}
	
	
}

