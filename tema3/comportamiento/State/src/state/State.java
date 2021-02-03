/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Carlos
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IEstadoSemaforo verde=new EstadoVerde();
        IEstadoSemaforo rojo=new EstadoRojo();
        
        Semaforo s = new Semaforo(verde);
        s.setEstado(verde);
        s.mostrar();
        s.setEstado(rojo);
        s.mostrar();
    }

}
