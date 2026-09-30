public class Main {
    public static void main(String[] args) {
        ArticuloGeek articuloPrincipal = new ArticuloGeek("Figura de robot", 32000.0);
        ArticuloGeek articuloSecundario = new ArticuloGeek("Pin coleccionable", 4500.0);
        ColeccionLote lote = new ColeccionLote("Lote de ciencia ficcion",
                articuloPrincipal, articuloSecundario);

        lote.mostrarDetalleLote();
    }
}