/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Coche {
    String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void GuardarCoche()
    {
        // Codigo para guardar en la BAsede Datos
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("No existe el driver de Mysql");

        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_estacionamiento", "root", "");
            PreparedStatement consulta = con.prepareStatement("INSERT INTO coches (marca) VALUES('"+getMarca()+"')");
            consulta.executeUpdate();
        } catch (SQLException ex) {
           System.out.println("No se pudo insertar de Mysql");
        }
    }
    
}
