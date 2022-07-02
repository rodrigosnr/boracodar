import org.openqa.selenium.support.PageFactory;

public class ProdutoPage extends ProdutoElementMap {
    public ProdutoPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }
    public void selecionaProdutoBikeLight() {
        linkBikeLight.click();
    }

    public void recuperaPrecoProduto() {
        txtPreco.getText();
        String preco = String.valueOf(txtPreco);
        System.out.println("O preço é" + preco);
    }

    public void clicaBotaoAdicionarCarrinho() {
    }

    public void clicaCarrinho() {
    }

    public void validaProduto() {
    }

    public void validaPreco() {
    }

    public void clicaBotaoCheckout() {
    }

    public void preenchePrimeiroNome() {
    }

    public void preencheUltimoNome() {
    }

    public void preencheCEP() {
    }

    public void clicaBotaoContinuar() {
    }

    public void clicaBotaoFinalizar() {
    }

    public void validaMensagemSucesso() {
    }
}
