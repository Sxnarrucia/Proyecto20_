package alquileresBase;

public class Alquileres {

    private int idEdificio;
    private int idPersona;
    private int contrato;
    private int fechaInicio;
    private int fechaVencimiento;
    private int mensualidad;

    private static int nuevoContrato;
    private static int nuevoIdEficio;
    private static int nuevoIdPersona;

    public static void setNuevoId() {
        nuevoIdEficio++;
    }

    public static void setNuevoId2() {
        nuevoIdPersona++;
    }

    public static void setNuevoContrato() {
        nuevoContrato++;
    }

    public Alquileres() {
    }

    public Alquileres(int fechaInicio, int fechaVencimiento, int mensualidad) {
        setNuevoId();
        this.idEdificio = nuevoIdEficio;
        setNuevoId2();
        this.idPersona = nuevoIdPersona;
        setNuevoContrato();
        this.contrato = nuevoContrato;
        this.fechaInicio = fechaInicio;
        this.fechaVencimiento = fechaVencimiento;
        this.mensualidad = mensualidad;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquileres{");
        sb.append("idEdificio=").append(idEdificio);
        sb.append(", idPersona=").append(idPersona);
        sb.append(", contrato=").append(contrato);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaVencimiento=").append(fechaVencimiento);
        sb.append(", mensualidad=").append(mensualidad);
        sb.append('}');
        return sb.toString();
    }

}
