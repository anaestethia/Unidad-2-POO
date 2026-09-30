import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("Detalle del carrito de compras:");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
        }
    }
}