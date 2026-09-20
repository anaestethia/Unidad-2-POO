public class Auto {
    String marca;
    String modelo;
    boolean encendido = false;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println("El auto arrancó.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El auto se apagó.");
    }

    public boolean isEncendido() {
        return encendido;
    }
}