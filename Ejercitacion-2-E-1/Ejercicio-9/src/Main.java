public class Main {
	public static void main(String[] args) {
		Producto producto1 = new Producto();
		producto1.setNombre("Teclado");
		producto1.setPrecio(25000);

		Producto producto2 = new Producto();
		producto2.setNombre("Mouse");
		producto2.setPrecio(12000);

		System.out.println("Primer producto: " + producto1.getNombre()
				+ " - $" + producto1.getPrecio());
		System.out.println("Segundo producto: " + producto2.getNombre()
				+ " - $" + producto2.getPrecio());

		CarritoDeCompras carrito = new CarritoDeCompras();
		carrito.agregarProducto(producto1);
		carrito.agregarProducto(producto2);

		carrito.mostrarDetalle();
		System.out.println("Total: $" + carrito.calcularTotal());
	}
}
