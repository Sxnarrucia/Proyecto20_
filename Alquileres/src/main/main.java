package main;

import controller.AlquileresControlador;
import controller.MenuController;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class main {

    public static void main(String[] args) {
        Inicio();
    }

    public static void Inicio() {
        MenuController menu = new MenuController();
        int opcion = 0;
        do {
            opcion = menu.menuMain();
            switch (opcion) {
                case 1:
                    edificios();
                    break;
                case 2:
                    personas();
                    break;
                case 3:
                    alquileres();
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 4);

    }

    public static void edificios() {
        JOptionPane.showMessageDialog(null, "Edificios");
    }

    public static void personas() {
        JOptionPane.showMessageDialog(null, "Personas");
    }

    public static void alquileres() {
        MenuController menu = new MenuController();
        AlquileresControlador alquiler = new AlquileresControlador();
        int opcion;
        do {
            try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué gestión desea realizar\n "
            +" 1 = Agregar alquiler\n "
            +" 2 = Modificar alquiler\n "
            +" 3 = Ver alquileres\n "
            +" 4 = Informe de alquileres\n "
            +" 5 = Eliminar alquiler\n "
            +" 6 = Salir al menú principal "));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción inválida");
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    alquiler.agregar();
                    break;
                case 2:
                    alquiler.modificar();
                    break;
                case 3:
                    alquiler.ver();
                    break;
                case 4:
                    alquiler.informe();
                    break;
                case 5:
                    alquiler.eliminar();
                    break;
                case 6:
                    Inicio();
                    break;
            }
        } while (opcion != 7);
        JOptionPane.showMessageDialog(null, "Opción no válida");
        Inicio();
    }
}