package bdd.page;
import bdd.webdriver.DOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class confirmacion extends DOM{
    @FindBy(xpath="/html/body/div[2]/div/div/p[1]")
    protected WebElement textocon;
    public String verificaf(){
        String t;
        return t = getText(textocon);
    }
    public void esperav(){espera(textocon);}
}
