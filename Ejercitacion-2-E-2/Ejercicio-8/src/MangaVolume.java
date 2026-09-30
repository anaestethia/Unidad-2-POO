public class MangaVolume {
    private String tituloSerie;
    private int numeroTomo;
    private int cantidadPaginas;

    public MangaVolume(String tituloSerie, int numeroTomo, int cantidadPaginas) {
        this.tituloSerie = tituloSerie;
        this.numeroTomo = numeroTomo;
        this.cantidadPaginas = cantidadPaginas;
    }

    public boolean esEdicionEspecial() {
        return esTomoExtenso();
    }

    private boolean esTomoExtenso() {
        return cantidadPaginas > 300;
    }

    @Override
    public String toString() {
        return String.format("Serie: %s | Tomo: %d | Paginas: %d | Edicion especial: %s",
                tituloSerie, numeroTomo, cantidadPaginas, esEdicionEspecial() ? "Si" : "No");
    }
}