public class Libro {
    String titulo;
    String autor;
    int paginasTotales;
    int paginaActual;

    public Libro(int paginasTotales) {
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0;
    }

    public int leerPaginas() {
        if (this.paginaActual < paginasTotales) {
            this.paginaActual++;
            return this.paginaActual;
        } else {
            System.out.println("La lectura ha finalizado");
            return this.paginaActual;
        }
    }

    public double mostrarProgreso() {
        double porcentaje;
        porcentaje = (this.paginaActual * 100.0) / paginasTotales;

        System.out.println("Porcentaje de lectura: " + porcentaje + "%");

        return porcentaje;
    }
}