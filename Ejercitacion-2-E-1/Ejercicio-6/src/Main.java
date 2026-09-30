public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro(100);
        for (int i = 0;i < 100; i+=10){
            if(i % 10 == 0){
                System.out.println("Pagina actual: " + libro1.leerPaginas());
                System.out.println("Porcentaje leido: " + libro1.mostrarProgreso());
            }
        }
    }
}