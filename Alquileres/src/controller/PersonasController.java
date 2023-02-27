package controller;

import base.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonasController {

    private static ArrayList<Personas> personasList = new ArrayList();

    public void agregar() {
        String nombre;
        int telefono;
        String correo;
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona a agregar");
        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de teléfono sin caracteres especiales"));
        correo = JOptionPane.showInputDialog(null, "Ingrese el correo de la persona");
        Personas persona = new Personas(nombre, telefono, correo);
        personasList.add(persona);
    }

    public void modificar() {
        int opcion = 0;
        int idPersona = -1;
        int indexPersona = -1;
        try {
            idPersona = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la persona a modificar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < personasList.size(); i++) {
            if (personasList.get(i).getIdPersona() == idPersona) {
                indexPersona = i;
                break;
            }
        }
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                    + " 1 = Nombre de la persona\n "
                    + " 2 = Télefono de la persona\n "
                    + " 3 = Correo de la persona "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        switch (opcion) {
            case 1:
                if (indexPersona != -1) {
                    String nombre = personasList.get(indexPersona).getNombrePersona();
                    nombre = JOptionPane.showInputDialog(null, "Ingrese nuevo nombre de la persona");
                    personasList.get(indexPersona).setNombrePersona(nombre);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
                break;
            case 2:
                if (indexPersona != -1) {
                    int telefono = personasList.get(indexPersona).getTelefonoPersona();
                    telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo número de la persona"));
                    personasList.get(indexPersona).setTelefonoPersona(telefono);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                    
                }
                break;
            case 3:
                if (indexPersona != -1) {
                    String correo = personasList.get(indexPersona).getCorreoPersona();
                    correo = JOptionPane.showInputDialog(null, "Ingrese nuevo correo de la persona");
                    personasList.get(indexPersona).setCorreoPersona(correo);
                    JOptionPane.showMessageDialog(null, "Modificado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no válida");
                }
                break;
        }
    }

    public void ver() {
        int idPersona = -1;

        try {
            idPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la persona a visualizar "));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresó un ID no válido");
        }

        for (int i = 0; i < personasList.size(); i++) {
            if (personasList.get(i).getIdPersona() == idPersona) {
                JOptionPane.showMessageDialog(null, personasList.get(i));
                break;
            }
        }
        if (idPersona == -1) {
            JOptionPane.showMessageDialog(null, "Persona no existe");
        }
    }

    public void informe() {
        String data = "";
        for (Personas indexPersonas : personasList) {
            data = data + (" ID Persona: " + indexPersonas.getIdPersona() + " Nombre de la persona: " + indexPersonas.getNombrePersona() + " Teléfono de la persona: " + indexPersonas.getTelefonoPersona() + " Correo de la persona: " + indexPersonas.getCorreoPersona() + "\n");
        }
        JOptionPane.showMessageDialog(null, data, "Personas", JOptionPane.NO_OPTION);
    }
    
        public void eliminar() {
        int idPersona = -1;
        int indexPersona = -1;
        try {
            idPersona = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID de la persona a modificar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingreso un ID no válido");
        }
        for (int i = 0; i < personasList.size(); i++) {
            if (personasList.get(i).getIdPersona() == idPersona) {
                indexPersona = i;
                break;
            }
        }
        if (indexPersona != -1) {
            personasList.remove(indexPersona);
            JOptionPane.showMessageDialog(null, "Persona eliminada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no válida");
        }

    }
}
