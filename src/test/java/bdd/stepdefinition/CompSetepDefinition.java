package bdd.stepdefinition;
import bdd.step.confirmacionstep;
import bdd.step.agregarpruductosstep;
import bdd.step.carritostep;
import bdd.step.checkoutstep;
import bdd.webdriver.DOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CompSetepDefinition {

    private final agregarpruductosstep agPruductosstep  = new agregarpruductosstep();
    private final DOM dom = new DOM();
    private final carritostep carro = new carritostep();
    private final confirmacionstep con = new confirmacionstep();
    private final checkoutstep check = new checkoutstep();


    @Given("Agregar dos productos al carrito {string}")
    public void agregarDosProductosAlCarrito(String url) {
        agPruductosstep.stepIniciarNavegador(url);
        agPruductosstep.agregarproducto1();
        agPruductosstep.scrollproducto2();
        agPruductosstep.esperaproducto2();
        agPruductosstep.agregarproducto2();
        agPruductosstep.esperacolorproducto2();
        agPruductosstep.colorproducto2();
        agPruductosstep.colorproducto2();
        agPruductosstep.opcioncolor();
        agPruductosstep.agregarproducto2v2();
    }
    @When("Visualizar el carrito {string}")
    public void visualizarElCarrito(String texto) {
        carro.scrollcarrito();
        carro.esperacarrito();
        carro.botoncarrito();
        String t=carro.verifica();
        Assertions.assertEquals(t,texto);
    }
    @And("Completar el Checkout como invitado Guest Checkout")
    public void completarElCheckoutComoInvitadoGuestCheckout() {
        check.scrollbtnCheckout();
        check.esperabtnCheckout();
        check.clickbtnCheckout();
        check.esperapCheckout();
        check.radiobtn1();
        check.btncontinua1();
        check.esperapnombre();
        check.innombre();
        check.inape();
        check.incorreo();
        check.inphone();
        check.incom();
        check.indir1();
        check.indir2();
        check.inciudad();
        check.inpostal();
        check.sbnpais();
        check.bnpais();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        check.bprov();
        check.ebd();
        check.cbd();
        check.esperabtncdelivery();
        check.clickbtncdelivery();
        check.esperacheckcondiciones();
        check.clickcheckcondiciones();
        check.esperabtncpayment();
        check.clickbtncpayment();
        check.esprabtncorden();
        check.clickbtncorden();
    }


    @Then("Finalizar la compra hasta la confirmación {string}")
    public void finalizarLaCompraHastaLaConfirmación(String texto) {
        con.esperav();
        String t= con.verificaf();
        System.out.println(t+"esto es");
        Assertions.assertEquals(t,texto);
        dom.quitDriver();
    }



}
