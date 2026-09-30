public class Comic {
    private String titulo;
    private double precio;
    private int stock;

    public Comic(String titulo, double precio, int stock) {
        this.titulo = titulo;
        setPrecio(precio);
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock inicial no puede ser negativo; se establecio en cero.");
            this.stock = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Se repusieron " + cantidad + " unidades de " + titulo + ".");
        } else {
            System.out.println("La reposicion debe ser mayor que cero.");
        }
    }

    public boolean venderUnidad() {
        if (stock > 0) {
            stock--;
            System.out.println("Se vendio una unidad de " + titulo + ". Stock restante: " + stock);
            return true;
        }
        System.out.println("No hay stock disponible de " + titulo + ".");
        return false;
    }
}