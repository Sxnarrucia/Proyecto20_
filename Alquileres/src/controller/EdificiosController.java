/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import base.Edificios;
import javax.swing.JOptionPane;

public class EdificiosController {

    private static ArrayList<Edificios> lstEdificios = new ArrayList();

    public void agregar() {
        String nombre;
        float areaConstruccion;

        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del edificio");
        areaConstruccion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el area de construcción"));
        Edificios edificio = new Edificios(nombre, areaConstruccion);
        lstEdificios.add(edificio);
    }

    public void modificar() {
        int opcion = 0;
        int idEdificio = -1;
        int indexEdificio = -1;
        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de edificio a modificar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < lstEdificios.size(); i++) {
            if (lstEdificios.get(i).getNumeroId() == idEdificio) {
                indexEdificio = i;
                break;
            }
        }
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                    + "1 = Nombre del edificio\n"
                    + "2 = Area de construcción"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        switch (opcion) {
            case 1:
                if (indexEdificio != -1) {
                    String nombre = lstEdificios.get(indexEdificio).getNombre();
                    nombre = JOptionPane.showInputDialog(null, "Ingrese nuevo nombre de Edificio");
                    lstEdificios.get(indexEdificio).setNombre(nombre);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
                break;
            case 2:
                if (indexEdificio != -1) {
                    float areaConstruccion = lstEdificios.get(indexEdificio).getAreaConstrucion();
                    areaConstruccion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese nueva area de Construccion"));
                    lstEdificios.get(indexEdificio).setAreaConstrucion(areaConstruccion);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
                break;
        }
    }

    public void ver() {
        int idEdificio = -1;

        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del edificio"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresó un ID no válido");
        }

        for (int i = 0; i < lstEdificios.size(); i++) {
            if (lstEdificios.get(i).getNumeroId() == idEdificio) {
                JOptionPane.showMessageDialog(null, lstEdificios.get(i));
                break;
            }
        }
        if (idEdificio == -1) {
            JOptionPane.showMessageDialog(null, "Edificio no existe");
        }
    }

    public void informe() {
        String data = "";
        for (Edificios indexEdificio : lstEdificios) {
            data = data + (" ID Edificio: " + indexEdificio.getNumeroId() + " Nombre de Edificio " + indexEdificio.getNombre() + " Area de Construccion " + indexEdificio.getAreaConstrucion() + "\n");
        }
        JOptionPane.showMessageDialog(null, data, "Edificios", JOptionPane.NO_OPTION);
    }

    public void eliminar() {
        int idEdificio = -1;
        int indexEdificio = -1;
        try {
            idEdificio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de edificio a eliminar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < lstEdificios.size(); i++) {
            if (lstEdificios.get(i).getNumeroId() == idEdificio) {
                indexEdificio = i;
                break;
            }
        }
        if (indexEdificio != -1) {
            lstEdificios.remove(indexEdificio);
            JOptionPane.showMessageDialog(null, "Edificio eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

    }

}
