public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();
        caja.registrarVenta(8500.0);
        caja.registrarVenta(12900.0);
        caja.registrarVenta(5600.0);

        System.out.println(String.format("Promedio de venta: $%.2f", caja.obtenerPromedioVenta()));
    }
}