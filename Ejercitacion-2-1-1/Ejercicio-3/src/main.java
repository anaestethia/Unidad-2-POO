public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla");

        System.out.println("Marca: " + auto.marca);
        System.out.println("Modelo: " + auto.modelo);
        System.out.println("Estado inicial: " + auto.isEncendido());

        auto.encender();
        System.out.println("Estado después de encender: " + auto.isEncendido());

        auto.apagar();
        System.out.println("Estado final: " + auto.isEncendido());
    }
}
