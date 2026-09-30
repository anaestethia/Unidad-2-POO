public class Main {
    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego("Hollow Knight", "PC", 12000.0);
        Videojuego juego2 = new Videojuego("The Legend of Zelda", "Nintendo Switch", 58000.0);
        Videojuego juego3 = new Videojuego("Minecraft", "PlayStation 5", 25000.0);

        System.out.println(String.format("%s | Plataforma: %s | Precio: $%.2f",
                juego1.getTitulo(), juego1.getPlataforma(), juego1.getPrecio()));
        System.out.println(String.format("%s | Plataforma: %s | Precio: $%.2f",
                juego2.getTitulo(), juego2.getPlataforma(), juego2.getPrecio()));
        System.out.println(String.format("%s | Plataforma: %s | Precio: $%.2f",
                juego3.getTitulo(), juego3.getPlataforma(), juego3.getPrecio()));
    }
}