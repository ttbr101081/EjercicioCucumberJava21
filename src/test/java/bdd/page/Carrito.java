package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Carrito extends DOM{

    @FindBy(xpath="/html/body/nav/div/div[2]/ul/li[4]/a/i")
    protected WebElement btncarrito;

    @FindBy(xpath="/html/body/div[2]/div/div/h1")
    protected WebElement txtcarrito;
    public  void scrollcarrito(){scroll(btncarrito);}
    public void ecarro(){espera(btncarrito);}
    public void carro(){onclick(btncarrito);}
    public String verifica(){
        String t;
        return t = getText(txtcarrito);
    }

}
