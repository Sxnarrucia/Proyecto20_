package controller;

import javax.swing.JOptionPane;

public class MenuController {

    public int menuMain() {
        int opcion;
        try {
            opcion = Byte.parseByte(JOptionPane.showInputDialog(null, ""
                    + "¿Qué desea gestionar\n"
                    + "1 = Edificios\n"
                    + "2 = Personas\n"
                    + "3 = Alquileres\n"
                    + "4 = Salir\n"));
        } catch (Exception e) {
            opcion = 0;
        }
        return opcion;
    }
}