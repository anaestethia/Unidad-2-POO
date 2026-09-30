public class ConsolaRetro {
    private String modelo;
    private String numeroSerie;
    private boolean encendida;

    public ConsolaRetro(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
        System.out.println(modelo + " (serie " + numeroSerie + ") se encendio.");
    }

    public void apagar() {
        encendida = false;
        System.out.println(modelo + " (serie " + numeroSerie + ") se apago.");
    }

    public void mostrarEstado() {
        if (encendida) {
            System.out.println(modelo + " esta encendida.");
        } else {
            System.out.println(modelo + " esta apagada.");
        }
    }
}