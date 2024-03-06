package bdd.page;

import bdd.webdriver.DOM;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends DOM {
    private static String nombre = "Rodrigo";
    private static String Apellido = "Teran";
    private static String correo = "test@test.com";
    private static String telefono = "022222222";
    private static String compania = "company";
    private static String ciudad = "Quito";
    private static String codpostal = "170562";
    private static String bpais="//option[. = 'Ecuador']";
    private static String bprov="//option[. = 'Pichincha']";
    @FindBy(xpath="/html/body/div[2]/div/div/div[3]/div[2]/a")
    protected WebElement btncheckout;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input")
    protected WebElement radiocheckout;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/input")
    protected WebElement btncon;
    @FindBy(xpath="//input[@id=\'input-payment-lastname\']")
    protected WebElement inputapellido;
    @FindBy(xpath="//input[@id=\'input-payment-firstname\']")
    protected WebElement inputnombre;
    @FindBy(xpath="//input[@id=\'input-payment-email\']")
    protected WebElement inputcorreo;
    @FindBy(xpath="//input[@id=\'input-payment-telephone\']")
    protected WebElement inputtelefono;
    @FindBy(id="input-payment-company")
    protected WebElement inputcompany;
    @FindBy(xpath="//input[@id=\'input-payment-address-1\']")
    protected WebElement inputdir1;
    @FindBy(xpath="//input[@id=\'input-payment-address-2\']")
    protected WebElement inputdir2;
    @FindBy(xpath="//input[@id=\'input-payment-city\']")
    protected WebElement inputciudad;
    @FindBy(xpath="//input[@id=\'input-payment-postcode\']")
    protected WebElement inputcodpostal;
    @FindBy(xpath="//*[@id=\"input-payment-country\"]")
    protected WebElement dropPais;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/fieldset/div[7]/select")
    protected WebElement dropProv;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/input")
    protected WebElement btncdetails;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input")
    protected WebElement btncdelivery;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[1]")
    protected WebElement checkcondiciones;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[2]")
    protected WebElement btncpayment;
    @FindBy(xpath="/html/body/div[2]/div/div/div/div[6]/div[2]/div/div[3]/div/input")
    protected WebElement btncorden;
    public void scrollbtnc(){scroll(btncheckout);}
    public void espera1(){espera(btncheckout);}
    public void btnC1(){onclick(btncheckout);}
    public void espera2(){espera(radiocheckout);}
    public void btnradio1(){onclick(radiocheckout);}
    public void btncon(){onclick(btncon);}
    public void esperanombre(){espera(inputnombre);}
    public void inombre(){type(inputnombre,nombre);}
    public void iapellido(){type(inputapellido, Apellido);}
    public void icorreo(){type(inputcorreo,correo);}
    public void iphone(){type(inputtelefono,telefono);}
    public void icompa(){type(inputcompany,compania);}
    public void idir1(){type(inputdir1,ciudad);}
    public void idir2(){type(inputdir2,ciudad);}
    public void iciudad(){type(inputciudad,ciudad);}
    public void ipostal(){type(inputcodpostal,codpostal);}
    public void sbpais(){scroll(dropProv);}
    public void bpais(){drop(dropPais,bpais);}

    public void bprov(){drop(dropProv,bprov);}
    public void esperabtncdetalles(){espera(btncdetails);}
    public void btncdetalles(){onclick(btncdetails);}
    public void esperabtncdelivery(){espera(btncdelivery);}
    public void clickbtncdelivery(){onclick(btncdelivery);}
    public void esperacheckcondiciones(){espera(checkcondiciones);}
    public void clickcheckcondiciones(){onclick(checkcondiciones);}
    public void esperabtncpayment(){espera(btncpayment);}
    public void clickbtncpayment(){onclick(btncpayment);}
    public void esprabtncorden(){espera(btncorden);}
    public void clickbtncorden(){onclick(btncorden);}
}
