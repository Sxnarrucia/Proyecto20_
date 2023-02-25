package alquileresController;

import alquileresBase.Alquileres;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlquileresControlador {

    private static ArrayList<Alquileres> alquileresList = new ArrayList();

    public void agregar() {
        int fechaIni;
        int fechaVenci;
        int mensual;
        fechaIni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha de inicio en el siguiente formato: díamesaño"));
        fechaVenci = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la fecha de vencimiento en el siguiente formato: díamesaño"));
        mensual = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la mensualidad en dólares"));
        Alquileres alquiler = new Alquileres(fechaIni, fechaVenci, mensual);
        alquileresList.add(alquiler);
    }

    public void modificar() {
        int opcion = 0;
        int idEdificio = -1;
        int indexAlquiler = -1;
        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de edificio a modificar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < alquileresList.size(); i++) {
            if (alquileresList.get(i).getIdEdificio() == idEdificio) {
                indexAlquiler = i;
                break;
            }
        }
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                    + "1 = Fecha Inicio\n"
                    + "2 = Fecha Vencimiento\n"
                    + "3 = Mensualidad"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        switch (opcion) {
            case 1:
                if (indexAlquiler != -1) {
                    int fechaIni = alquileresList.get(indexAlquiler).getFechaInicio();
                    fechaIni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nueva fecha de Inicio"));
                    alquileresList.get(indexAlquiler).setFechaInicio(fechaIni);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
                break;
            case 2:
                if (indexAlquiler != -1) {
                    int fechaVenci = alquileresList.get(indexAlquiler).getFechaVencimiento();
                    fechaVenci = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nueva fecha de Vencimiento"));
                    alquileresList.get(indexAlquiler).setFechaVencimiento(fechaVenci);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
            case 3:
                if (indexAlquiler != -1) {
                    int mensual = alquileresList.get(indexAlquiler).getMensualidad();
                    mensual = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nueva mensualidad"));
                    alquileresList.get(indexAlquiler).setMensualidad(mensual);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
        }
    }

    public void ver() {
        int idEdificio = -1;

        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del edificio"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresó un ID no válido");
        }

        for (int i = 0; i < alquileresList.size(); i++) {
            if (alquileresList.get(i).getIdEdificio() == idEdificio) {
                JOptionPane.showMessageDialog(null, alquileresList.get(i));
                break;
            }
        }
        if (idEdificio == -1) {
            JOptionPane.showMessageDialog(null, "Edificio no existe");
        }
    }

    public void informe() {
        String data = "";
        for (Alquileres indexAlquileres : alquileresList) {
            data = data + (" ID Edificio: " + indexAlquileres.getIdEdificio() + " ID Persona " + indexAlquileres.getIdPersona() + " Contrato: " + indexAlquileres.getContrato() + " Fecha Vencimiento: " + indexAlquileres.getFechaVencimiento() + " Fecha Inicio: " + indexAlquileres.getFechaInicio() + " Mensualidad: $" + indexAlquileres.getMensualidad() + "\n");
        }
        JOptionPane.showMessageDialog(null, data, "Edificios", JOptionPane.NO_OPTION);
    }

    public void eliminar() {
        int idEdificio = -1;
        int indexAlquiler = -1;
        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de edificio a modificar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < alquileresList.size(); i++) {
            if (alquileresList.get(i).getIdEdificio() == idEdificio) {
                indexAlquiler = i;
                break;
            }
        }
        if (indexAlquiler != -1) {
            alquileresList.remove(indexAlquiler);
            JOptionPane.showMessageDialog(null, "Alquiler eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

    }
}
