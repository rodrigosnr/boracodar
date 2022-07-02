import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ProdutosSteps {

    ProdutoPage produtoPage = new ProdutoPage();

    @Dado("que estou na página de escolha de produtos e adiciono um produto ao carrinho")
    public void adicionarProdutosAoCarrinho() {
        produtoPage.selecionaProdutoBikeLight();
        produtoPage.recuperaPrecoProduto();
        produtoPage.clicaBotaoAdicionarCarrinho();
    }

    @Quando("clico no carrinho e confiro se o produto adicionado e seu preço estão de acordo com a escolha")
    public void clicarNoCarrinhoEChecarEscolha() {
        produtoPage.clicaCarrinho();
        produtoPage.validaProduto();
        produtoPage.validaPreco();
    }

    @E("clico no botão checkout e preencho as minhas informações e depois clico em Continuar")
    public void clicarNoBotaoCheckoutEPreencherInformacoes() {
        produtoPage.clicaBotaoCheckout();
        produtoPage.preenchePrimeiroNome();
        produtoPage.preencheUltimoNome();
        produtoPage.preencheCEP();
        produtoPage.clicaBotaoContinuar();
    }

    @Então("é exibida uma página para finalizar a compra e uma mensagem de agradecimento agradecendo a compra")
    public void validaSeCompraFoiEfetuadaComSucesso() {
        produtoPage.clicaBotaoFinalizar();
        produtoPage.validaMensagemSucesso();
    }
}
