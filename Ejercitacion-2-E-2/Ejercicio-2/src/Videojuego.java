public class Videojuego {
    private String titulo;
    private String plataforma;
    private double precio;

    public Videojuego(String titulo, String plataforma, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPrecio() {
        return precio;
    }
}