package starter.n11.SellerOffice.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11SellerOfficePageElements
{
    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("pass textbox").located(By.id("passwordInputText"));
    public static Target PASSWORD_RETYPE_FIELD = Target.the("pass-retype textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target EMAIL_RETYPE_FIELD = Target.the("email-retype textbox").located(By.id("emailRetypeInputText"));
    public static Target STORENAME_FIELD = Target.the("storename textbox").located(By.id("nicknameInputText"));
    public static Target SIGN_BTN = Target.the("login btn").located(By.id("j_id274_j_id_dj"));
}
