public class Cliente {
    private String nombre;
    private GiftCard tarjeta;

    public Cliente(String nombre, GiftCard tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public void realizarCompra(double monto) {
        if (tarjeta.descontarSaldo(monto)) {
            System.out.println(nombre + " realizo una compra de $" + monto
                    + " con la tarjeta " + tarjeta.getCodigo() + ".");
            System.out.println("Saldo restante: $" + tarjeta.getSaldo());
        } else {
            System.out.println(nombre + " no pudo realizar la compra de $" + monto
                    + ": saldo insuficiente o monto invalido.");
        }
    }
}