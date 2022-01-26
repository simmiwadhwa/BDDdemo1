package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class PostSteps {
    @Given("^user should be logged in and should be present on his wall$")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndShouldBePresentOnHisWall");
    }

    @When("^I type the message in the text box$")
    public void iTypeTheMessageInTheTextBox() {
        System.out.println("iTypeTheMessageInTheTextBox");
        System.out.println("Hello World");
    }


    @And("^click on Post button$")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("^message should get posted$")
    public void messageShouldGetPosted() {
        System.out.println("messageShouldGetPosted");
    }
}
