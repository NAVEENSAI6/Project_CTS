package Com.Definition;

import java.io.IOException;

import Com.Pages.Addingtocart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addingtocart_definition extends Addingtocart{
	@Given("^Open the URL in browser$")
	public void open_the_URL_in_browser() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		Launch_URL();
		login();
	}

	@When("^Select an item$")
	public void select_an_item() {
	    // Write code here that turns the phrase above into concrete actions
		mouseactions();
		Select_item();
	}

	@Then("^Click on Add to cart option$")
	public void click_on_Add_to_cart_option() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Click_Addtocart();
	}
}
