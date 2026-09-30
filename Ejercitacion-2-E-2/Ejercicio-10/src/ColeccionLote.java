public class ColeccionLote {
    private String descripcion;
    private ArticuloGeek articuloPrincipal;
    private ArticuloGeek articuloSecundario;

    public ColeccionLote(String descripcion, ArticuloGeek articuloPrincipal,
            ArticuloGeek articuloSecundario) {
        this.descripcion = descripcion;
        this.articuloPrincipal = articuloPrincipal;
        this.articuloSecundario = articuloSecundario;
    }

    public double calcularValorLote() {
        return articuloPrincipal.getPrecioBase() + articuloSecundario.getPrecioBase();
    }

    public void mostrarDetalleLote() {
        System.out.println("Lote: " + descripcion);
        System.out.println(articuloPrincipal.getNombre() + " - $" + articuloPrincipal.getPrecioBase());
        System.out.println(articuloSecundario.getNombre() + " - $" + articuloSecundario.getPrecioBase());
        System.out.println("Valor total del lote: $" + calcularValorLote());
    }
}