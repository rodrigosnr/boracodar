import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Dado("que acesso uma página da internet")
    public void acessarPaginaDaInternet() {

    }

    @Quando("digito login e senha")
    public void digitarLoginESenha() {
        loginPage.clicaLogin();
        loginPage.digitaLogin();
        loginPage.clicaSenha();
        loginPage.digitaSenha();
    }

    @E("clico no botão login")
    public void clicarNoBotaoLogin() {
        loginPage.clicaBotaoLogin();
    }

    @Então("a página de produtos é exibida")
    public void exibirPaginaDeProdutos() throws InterruptedException {
        Assert.assertTrue(loginPage.validaTextoProduto());
    }
}
