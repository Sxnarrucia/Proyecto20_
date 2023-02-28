package main;

import controller.AlquileresControlador;
import controller.MenuController;
import controller.PersonasController;
import controller.EdificiosController;
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
        MenuController menu = new MenuController();
        EdificiosController edificio = new EdificiosController();
        int opcion;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué gestión desea realizar\n "
                        + " 1 = Agregar edificio\n "
                        + " 2 = Modificar edificio\n "
                        + " 3 = Ver edificios\n "
                        + " 4 = Informe de edificios\n "
                        + " 5 = Eliminar edificio\n "
                        + " 6 = Salir al menú principal "));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción inválida");
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    edificio.agregar();
                    break;
                case 2:
                    edificio.modificar();
                    break;
                case 3:
                    edificio.ver();
                    break;
                case 4:
                    edificio.informe();
                    break;
                case 5:
                    edificio.eliminar();
                    break;
                case 6:
                    Inicio();
                    break;
            }
        } while (opcion != 7);
        JOptionPane.showMessageDialog(null, "Opción no válida");
        Inicio();
    }

    public static void personas() {
        MenuController menu = new MenuController();
        PersonasController persona = new PersonasController();
        int opcion;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué gestión desea realizar\n "
                        + " 1 = Agregar persona\n "
                        + " 2 = Modificar persona\n "
                        + " 3 = Ver personas\n "
                        + " 4 = Informe de personas\n "
                        + " 5 = Eliminar persona\n "
                        + " 6 = Salir al menú principal "));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opción inválida");
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    persona.agregar();
                    break;
                case 2:
                    persona.modificar();
                    break;
                case 3:
                    persona.ver();
                    break;
                case 4:
                    persona.informe();
                    break;
                case 5:
                    persona.eliminar();
                    break;
                case 6:
                    Inicio();
                    break;
            }
        } while (opcion != 7);
        JOptionPane.showMessageDialog(null, "Opción no válida");
        Inicio();
    }

    public static void alquileres() {
        MenuController menu = new MenuController();
        AlquileresControlador alquiler = new AlquileresControlador();
        int opcion;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué gestión desea realizar\n "
                        + " 1 = Agregar alquiler\n "
                        + " 2 = Modificar alquiler\n "
                        + " 3 = Ver alquileres\n "
                        + " 4 = Informe de alquileres\n "
                        + " 5 = Eliminar alquiler\n "
                        + " 6 = Salir al menú principal "));
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
