public class Main {
    public static void main(String[] args) {
        ConsolaRetro consola = new ConsolaRetro("Game Boy", "GB-1989-001");

        consola.mostrarEstado();
        consola.encender();
        consola.mostrarEstado();
        consola.apagar();
        consola.mostrarEstado();
    }
}