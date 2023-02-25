/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import alquileresController.AlquileresControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class test {

    public static void main(String[] args) {
        boolean salir = false;
        int opcion = 0;
        AlquileresControlador menuTest = new AlquileresControlador();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion deseada"));
            switch (opcion) {
                case 1:
                    menuTest.agregar();
                    break;
                case 2:
                    menuTest.modificar();
                    break;
                case 3:
                    menuTest.informe();
                    break;
                case 4:
                    menuTest.ver();
                    break;
                case 5:
                    menuTest.eliminar();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        } while (salir = true);
    }
}
