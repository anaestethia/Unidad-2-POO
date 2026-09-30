public class CajaRegistradora {
    private double montoRecaudado;
    private int totalVentasRealizadas;

    public CajaRegistradora() {
        montoRecaudado = 0;
        totalVentasRealizadas = 0;
    }

    public void registrarVenta(double monto) {
        if (monto < 0) {
            System.out.println("El monto de la venta no puede ser negativo.");
            return;
        }
        montoRecaudado += monto;
        totalVentasRealizadas++;
    }

    public double obtenerPromedioVenta() {
        if (totalVentasRealizadas == 0) {
            return 0;
        }
        return montoRecaudado / totalVentasRealizadas;
    }
}