// Page URL: https://formy-project.herokuapp.com/form
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

//    Vaidate
String expectedUrl= driver.getCurrentUrl();

//Add button
@FindBy(xpath = "//a[contains(text(),'Add-user')]")
private WebElement Add_user_button;

//Add user
    private final String LAST_NAME = "Last Name";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "Username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//a[contains(radiobutton(),'Company-AAA')]")
    private WebElement Company_AAA;

    @FindBy(xpath = "//a[contains(radiobutton(),'Company-BBB')]")
    private WebElement Company_BBB;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "cellphone")
    private WebElement cellphone;


    @FindBy(xpath = "//a[contains(text(),'SAVE')]")
    private WebElement SAVE_Button;

    @FindBy(xpath = "//a[contains(text(),'SAVE')]")
    private WebElement Close_Button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void pressSaveButton(){
        this.save_button.click();
    }
    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}
