/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author Carlos
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "uno", 100);

        ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoAImpl());
        cuentaProxy.mostrarSaldo(c);
        c = cuentaProxy.depositarDinero(c, 50);
        c = cuentaProxy.retirarDinero(c, 20);
        cuentaProxy.mostrarSaldo(c);
        
        CuentaBancoAImpl cuentaA=new  CuentaBancoAImpl();
        c = cuentaA.depositarDinero(c, 100);
        c = cuentaA.retirarDinero(c,30);
        cuentaA.mostrarSaldo(c);
    }

}
