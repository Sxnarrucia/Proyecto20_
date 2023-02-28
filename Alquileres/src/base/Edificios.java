package base;

public class Edificios {

    private int numeroId;
    private String nombre;
    private float areaConstrucion;

    private static int idNuevo;

    public static void setIdNuevo() {
        idNuevo++;
    }

    public Edificios() {

    }

    public Edificios(String nombre, float areaConstrucion) {

        setIdNuevo();
        this.numeroId = idNuevo;
        this.nombre = nombre;
        this.areaConstrucion = areaConstrucion;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAreaConstrucion() {
        return areaConstrucion;
    }

    public void setAreaConstrucion(float areaConstrucion) {
        this.areaConstrucion = areaConstrucion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EdificiosAlquiler{");
        sb.append("numeroId=").append(numeroId);
        sb.append(", nombre=").append(nombre);
        sb.append(", areaConstrucion=").append(areaConstrucion);
        sb.append('}');
        return sb.toString();
    }

}
