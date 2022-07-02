import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPage extends LoginElementMap{

    private static final String PRODUTO = "Products";

    public LoginPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }
    public void clicaLogin(){
        txtLogin.click();
    }

    public void digitaLogin(){
        txtLogin.sendKeys("standard_user");
    }

    public void clicaSenha(){
        txtSenha.click();
    }

    public void digitaSenha(){
        txtSenha.sendKeys("secret_sauce");
    }

    public void clicaBotaoLogin() {
        btnLogin.click();
    }

    public boolean validaTextoProduto() throws InterruptedException {
        //return spanProduto.getText().equals(PRODUTO);
        return linkCarrinho.isEnabled();
    }
}
