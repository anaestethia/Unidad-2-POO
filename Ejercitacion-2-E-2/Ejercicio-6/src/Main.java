public class Main {
    public static void main(String[] args) {
        Comic comic = new Comic("Saga: La coleccion", 9500.0, 2);
        comic.venderUnidad();
        comic.venderUnidad();
        comic.venderUnidad();

        comic.reponerStock(3);
        comic.venderUnidad();
        System.out.println("Stock final: " + comic.getStock());
    }
}