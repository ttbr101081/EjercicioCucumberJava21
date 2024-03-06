package bdd.step;
import bdd.page.AgProducto;

public class agregarpruductosstep {
    public AgProducto agProducto() {
        return new AgProducto();
    }
    public void stepIniciarNavegador(String url) {
        agProducto().iniciarNavegador(url);
    }
    public void scrollproducto2(){agProducto().scrollproducto2();}
    public void esperaproducto2(){agProducto().esperaproducto2();}
    public void agregarproducto1(){agProducto().agregarproducto1();}
    public void agregarproducto2(){agProducto().agregarproducto2();}
    public void esperacolorproducto2(){agProducto().esperacolorb2();}
    public void colorproducto2(){agProducto().colorb2();}
    public void opcioncolor(){agProducto().opcioncolorb2();}
    public void agregarproducto2v2(){agProducto().agregarproductov2();}

}