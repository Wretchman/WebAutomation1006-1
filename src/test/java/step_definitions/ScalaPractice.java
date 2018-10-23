package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_classes.Setdriver;

public class ScalaPractice {
	WebDriver driver;

	public ScalaPractice() {
		driver = Setdriver.webDriver;
	}

	@Given("^I launch the Scala home page url$")
	public void i_launch_the_Scala_home_page_url() throws Throwable {
		Thread.sleep(2000);
		driver.get("https://scala.com/");
	}
	@When("^I click in INDUSTRY link$")
	public void i_click_in_INDUSTRY_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("INDUSTRY")).click();
		Thread.sleep(4000);
	   
	}

	@When("^I select \"([^\"]*)\" in the Scala$")
	public void i_select_in_the_Scala(String Link_text) throws Throwable {
		// driver.findElement(By.xpath("//a[@href='https://scala.com/digital-signage-solutions/']")).click();
		/*driver.findElement(By.linkText("INDUSTRY")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='https://scala.com/wp-content/uploads/2014/10/argos.jpg']")).click();
		Thread.sleep(4000);*/
		driver.findElement(By.linkText(Link_text)).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//img[@src='https://scala.com/wp-content/uploads/2014/10/argos.jpg']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='https://scala.com/wp-content/uploads/2014/10/wendysfr.png']")).click();
		Thread.sleep(4000);*/
		

	}

	@Then("^I verified the selected Scala page by the existence of the \"([^\"]*)\" text$")
	public void i_verified_the_selected_Scala_page_by_the_existence_of_the_text(String linkedPage_text) throws Throwable {
		
			Assert.assertEquals(true, driver.getPageSource().contains(linkedPage_text));
			Thread.sleep(2000); // tempora

	}
	

	@When("^I click on the Solutions link$")
	public void i_click_on_the_Solutions_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SOLUTIONS")).click();
		
		
	}

	@Then("^I see the Solutions page$")
	public void i_see_the_Solutions_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.getPageSource().contains("Full Service Solutions Providers"));
		Thread.sleep(2000); // temporary wait

	}

	@When("^I click on the Innovations link$")
	public void i_click_on_the_Innovations_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("INNOVATIONS")).click();

	}

	@Then("^I see the Innovations page$")
	public void i_see_the_Innovations_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.getPageSource().contains("We’re an end-to-end, full service solutions provider. "));
		Thread.sleep(2000); // temporary wait


	}

}
