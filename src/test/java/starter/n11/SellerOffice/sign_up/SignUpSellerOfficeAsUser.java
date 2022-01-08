package starter.n11.SellerOffice.sign_up;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.n11.SellerOffice.user_interface.n11SellerOfficePageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class SignUpSellerOfficeAsUser implements Task
{
    private final String username_text;
    private final String password_text;
    private final String password_retype_text;
    private final String email_text;
    private final String email_retype_text;
    private final String storename_text;

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(n11SellerOfficePageElements.USERNAME_FIELD),
                SendKeys.of(this.username_text).into(n11SellerOfficePageElements.USERNAME_FIELD),
                Click.on(n11SellerOfficePageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(n11SellerOfficePageElements.PASSWORD_FIELD),
                Click.on(n11SellerOfficePageElements.PASSWORD_RETYPE_FIELD),
                SendKeys.of(this.password_retype_text).into(n11SellerOfficePageElements.PASSWORD_RETYPE_FIELD),
                Click.on(n11SellerOfficePageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(n11SellerOfficePageElements.EMAIL_FIELD),
                Click.on(n11SellerOfficePageElements.EMAIL_RETYPE_FIELD),
                SendKeys.of(this.email_retype_text).into(n11SellerOfficePageElements.EMAIL_RETYPE_FIELD),
                Click.on(n11SellerOfficePageElements.STORENAME_FIELD),
                SendKeys.of(this.storename_text).into(n11SellerOfficePageElements.STORENAME_FIELD),

                Click.on(n11SellerOfficePageElements.SIGN_BTN)
        );

    }

    public SignUpSellerOfficeAsUser(String username_text,String password_text,String password_retype_text, String email_text,String email_retype_text,String storename_text)
    {
        this.username_text = username_text;
        this.password_text = password_text;
        this.password_retype_text = password_retype_text;
        this.email_text = email_text;
        this.email_retype_text = email_retype_text;
        this.storename_text = storename_text;


    }

    public static SignUpSellerOfficeAsUser signUpThePage(String username_text,String password_text,String password_retype_text, String email_text,String email_retype_text,String storename_text)
    {
        return instrumented(SignUpSellerOfficeAsUser.class
                ,username_text,password_text,password_retype_text,email_text,email_retype_text,storename_text);
    }
}
