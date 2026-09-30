import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana");
        ana.agregarNota(8.5);
        ana.agregarNota(7.0);
        ana.agregarNota(9.0);

        Estudiante luis = new Estudiante("Luis");
        luis.agregarNota(5.0);
        luis.agregarNota(6.0);
        luis.agregarNota(4.5);

        System.out.println("Nombre: " + ana.getNombre());
        System.out.println("Promedio de Ana: " + ana.calcularPromedio());
        System.out.println("¿Ana aprobó? " + ana.haAprobado());

        System.out.println("\nNombre: " + luis.getNombre());
        System.out.println("Promedio de Luis: " + luis.calcularPromedio());
        System.out.println("¿Luis aprobó? " + luis.haAprobado());
    }
}
