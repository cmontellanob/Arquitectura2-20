/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Adapter {
    private static Scanner S = new Scanner(System.in);
    private static Motor motor;
    
    public static void main(String[] args) {
        System.out.println("");
        int opcion;
        do{
            opcion = preguntarOpcion();
            switch(opcion) {
                case 1:
                    motor = new MotorComun();
                    usarMotor();
                    break;
                case 2:
                    motor = new MotorEconomico();
                    usarMotor();
                    break;
                case 3:
                    motor = new MotorElectricoAdapter();
                    usarMotor();
                    break;
                case 4:
                    System.out.println("¡Cerrando programa!");
                    break;
                default:
                    System.out.println("La opción ingresada NO es válida.");
            }
            System.out.print("\n\n");
        }while(opcion!=4);
    }

    private static int preguntarOpcion() {
        System.out.print(
                "MENÚ DE OPCIONES\n"
               +"---- -- --------\n"
               +"1. Encender motor común.\n"
               +"2. Encender motor económico.\n"
               +"3. Encender motor eléctrico.\n"
               +"4. Salir.\n"
               +"Seleccione opción: "
        );
        return Integer.parseInt( S.nextLine() );
    }

    private static void usarMotor() {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}