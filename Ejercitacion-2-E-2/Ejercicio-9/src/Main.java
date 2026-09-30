public class Main {
    public static void main(String[] args) {
        GiftCard tarjeta = new GiftCard("GEEK-2026", 50000.0);
        Cliente cliente = new Cliente("Sofia", tarjeta);

        cliente.realizarCompra(18000.0);
        cliente.realizarCompra(40000.0);
    }
}