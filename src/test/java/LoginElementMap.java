import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginElementMap {
    @FindBy(xpath = "//*[@id='user-name']")
    protected WebElement txtLogin;

    @FindBy(xpath = "//*[@id='password']")
    protected WebElement txtSenha;

    @FindBy(xpath = "//*[@id='login-button']")
    protected WebElement btnLogin;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/span")
    protected WebElement spanProduto;

    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    protected WebElement linkCarrinho;
}
