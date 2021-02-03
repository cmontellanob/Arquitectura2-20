/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Carlos
 */
public class MementoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
		String nombreJuego = "Crash Bandicoot";
		
		Juego juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(1);

		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(2);
		originator.setEstado(juego);
                

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(3);		
		originator.setEstado(juego);

		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 0

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(4);

		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 1

		juego = new Juego();
		juego.setNombre(nombreJuego);
		juego.setCheckpoint(5);
                System.out.println(juego);
		originator.setEstado(juego);
		caretaker.addMemento(originator.guardar()); // ESTADO POSICION 2

		originator.setEstado(juego);
		originator.restaurar(caretaker.getMemento(1));

		juego = originator.getEstado();
		System.out.println(juego);
                
                originator.restaurar(caretaker.getMemento(2));

		juego = originator.getEstado();
		System.out.println(juego);
    }
    
}
