import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private ArrayList<Double> calificaciones;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    public Estudiante(String nombre, ArrayList<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void agregarNota(double nota) {
        calificaciones.add(nota);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }

        return suma / calificaciones.size();
    }

    public boolean haAprobado() {
        return calcularPromedio() >= 6;
    }
}
