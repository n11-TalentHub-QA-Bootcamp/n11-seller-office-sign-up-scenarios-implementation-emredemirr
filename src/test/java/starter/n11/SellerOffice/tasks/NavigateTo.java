package starter.n11.SellerOffice.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11.navigation.user_interface.n11HomePage;
import starter.n11.SellerOffice.user_interface.n11SellerOfficeSignUpPage;

public class NavigateTo {

    public static Performable theN11SellerOfficeSignUpPage()
    {
        return Task.where("{0} opens the n11 selleroffice signup page",
                Open.browserOn().the(n11SellerOfficeSignUpPage.class));
    }
}
