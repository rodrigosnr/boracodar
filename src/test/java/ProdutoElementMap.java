import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.w3c.dom.Text;

public class ProdutoElementMap {

    @FindBy(xpath = "//*[@id='item_0_title_link']/div")
    protected WebElement linkBikeLight;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[2]/div/div/div[2]/div[3]")
    protected WebElement txtPreco;
}
