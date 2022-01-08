package starter.stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.SellerOffice.sign_up.SignUpSellerOfficeAsUser;
import starter.n11.SellerOffice.tasks.NavigateTo;

public class N11SellerOfficeSignUpStepDefinitions {
    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the signup page")
    public void userLaunchBrowserAndOpenTheSignupPage()
    {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.theN11SellerOfficeSignUpPage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void userSignedInSellerofficeWithValidCredentials()
    {
        actor.attemptsTo(SignUpSellerOfficeAsUser.signUpThePage("emre", "1234",
                "1234","emre@test.com","emre@test.com","qaStore"));
    }

    @Then("user signed in selleroffice successfully")
    public void userSignedSellerofficeSuccessfully()
    {
        try
        {
            Thread.sleep(30000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        actor.attemptsTo(

        );

    }
}