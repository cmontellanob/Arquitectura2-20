/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionFabrica fabrica = new ConexionFabrica();
        Scanner entrada = new Scanner(System.in);  // Create a Scanner object
        System.out.println("A que Servidor desea conectarse (MySQL,PostgreSQL,SQLite,SQLServer)");
        String motor = entrada.nextLine();  // Read user input
        IConexion conexion = fabrica.getConexion(motor);
        conexion.conectar();
        conexion.desconectar();
    }
    
}
