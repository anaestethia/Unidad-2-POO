public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.println("Valor inicial: " + contador.getValor());
        System.out.println("Valor incrementado: " + contador.incrementar());
        System.out.println("Valor decrementado: " + contador.decrementar());
        System.out.println("Valor restablecido a cero: " + contador.resetear());

    }
}