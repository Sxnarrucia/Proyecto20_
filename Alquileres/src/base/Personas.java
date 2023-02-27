package base;

public class Personas {

    private int idPersona;
    private String nombrePersona;
    private int telefonoPersona;
    private String correoPersona;

    private static int nuevoIdPersona;

    public static void setNuevoId() {
        nuevoIdPersona++;
    }

    public Personas() {
    }

    public Personas(String nombrePersona, int telefonoPersona, String correoPersona) {
        setNuevoId();
        this.idPersona = nuevoIdPersona;
        this.nombrePersona = nombrePersona;
        this.telefonoPersona = telefonoPersona;
        this.correoPersona = correoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonasController{");
        sb.append("idPersona=").append(idPersona);
        sb.append(", nombrePersona=").append(nombrePersona);
        sb.append(", telefonoPersona=").append(telefonoPersona);
        sb.append(", correoPersona=").append(correoPersona);
        sb.append('}');
        return sb.toString();
    }

}
