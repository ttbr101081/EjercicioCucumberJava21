package bdd.step;
import bdd.page.Checkout;
public class checkoutstep {
    public Checkout checkout() {
        return new Checkout();
    }
    public void scrollbtnCheckout() {
        checkout().scrollbtnc();
    }
    public void esperabtnCheckout() {
        checkout().espera1();
    }
    public void clickbtnCheckout() {
        checkout().btnC1();
    }
    public void esperapCheckout() {
        checkout().espera2();
    }
    public void radiobtn1() {
        checkout().btnradio1();
    }
    public void btncontinua1() {
        checkout().btncon();
    }
    public void esperapnombre() {
        checkout().esperanombre();
    }
    public void innombre() {
        checkout().inombre();
    }
    public void inape() {
        checkout().iapellido();
    }
    public void incorreo() {
        checkout().icorreo();
    }
    public void inphone() {
        checkout().iphone();
    }
    public void incom() {
        checkout().icompa();
    }
    public void indir1() {
        checkout().idir1();
    }
    public void indir2() {
        checkout().idir2();
    }
    public void inciudad() {
        checkout().iciudad();
    }
    public void inpostal() {
        checkout().ipostal();
    }
    public void sbnpais() {
        checkout().sbpais();
    }
    public void bnpais() {
        checkout().bpais();
    }

    public void bprov() {
        checkout().bprov();
    }
    public void ebd(){
        checkout().esperabtncdetalles();
    }
    public void cbd(){
        checkout().btncdetalles();
    }
    public void esperabtncdelivery(){checkout().esperabtncdelivery();}
    public void clickbtncdelivery(){checkout().clickbtncdelivery();}
    public void esperacheckcondiciones(){checkout().esperacheckcondiciones();}
    public void clickcheckcondiciones(){checkout().clickcheckcondiciones();}
    public void esperabtncpayment(){checkout().esperabtncpayment();}
    public void clickbtncpayment(){checkout().clickbtncpayment();}
    public void esprabtncorden(){checkout().esprabtncorden();}
    public void clickbtncorden(){checkout().clickbtncorden();}
}