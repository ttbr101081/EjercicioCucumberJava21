package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AgProducto extends DOM {
    @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")
    protected WebElement btnA1;

    @FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[4]/div/div[3]/button[1]")
    protected WebElement btnAv1;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select")
    protected WebElement btncolor;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[2]")
    protected WebElement btncoloropcion;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    protected WebElement btnAv2;



    public void iniciarNavegador(String url) {
        inciarNavegador(url);
    }
    public void agregarproducto1(){onclick(btnA1);}
    public void scrollproducto2(){scroll(btnA1);}
    public void esperaproducto2() {espera(btnAv1);}
    public void agregarproducto2() {onclick(btnAv1);}
    public void esperacolorb2() {espera(btncolor);}
    public void colorb2() {onclick(btncolor);}
    public void opcioncolorb2() {
        onclick(btncoloropcion);
    }
    public void agregarproductov2() {
        onclick(btnAv2);
    }
}
