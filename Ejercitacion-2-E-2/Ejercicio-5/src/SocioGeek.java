public class SocioGeek {
    private int numeroSocio;
    private String nombre;
    private int puntosFidelidad;

    public SocioGeek(int numeroSocio, String nombre, int puntosFidelidad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        setPuntosFidelidad(puntosFidelidad);
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(int puntosFidelidad) {
        if (puntosFidelidad >= 0) {
            this.puntosFidelidad = puntosFidelidad;
        } else {
            System.out.println("Error: los puntos de fidelidad no pueden ser negativos.");
        }
    }
}