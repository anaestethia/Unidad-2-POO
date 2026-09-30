public class ArticuloGeek {
    private String nombre;
    private double precioBase;

    public ArticuloGeek(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = Math.max(0, precioBase);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}