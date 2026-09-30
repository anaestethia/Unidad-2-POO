public class Main {
    public static void main(String[] args) {
        ArticuloGeek articulo1 = new ArticuloGeek();
        articulo1.nombre = "Figura de coleccion";
        articulo1.precioBase = 18500.0;

        ArticuloGeek articulo2 = new ArticuloGeek();
        articulo2.nombre = "Taza de videojuego";
        articulo2.precioBase = 7200.0;

        System.out.println("Articulo 1: " + articulo1.nombre + " - $" + articulo1.precioBase);
        System.out.println("Articulo 2: " + articulo2.nombre + " - $" + articulo2.precioBase);
    }
}