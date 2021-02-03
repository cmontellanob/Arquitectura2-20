/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Carlos
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta = new Cuenta(1, 200);

		Depositar opDepositar100 = new Depositar(cuenta, 100);
		Retirar opRetirar50 = new Retirar(cuenta, 50);
                Depositar opDepositar1000 = new Depositar(cuenta, 1000);


		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar100);
		ivk.recibirOperacion(opRetirar50);
		ivk.recibirOperacion(opRetirar50);
                ivk.recibirOperacion(opDepositar1000);
		
		
		ivk.realizarOperaciones();
    }
    
}
