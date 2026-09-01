public class Main {
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Ciro", "Perro", 3);
        Mascota mascota2 = new Mascota("Chicho", "Gato", 2);
        Mascota mascota3 = new Mascota("Pirucha", "Loro", 5);

        System.out.println("Nombre: " + mascota1.nombre + ", especie: " + mascota1.especie + ", edad: " + mascota1.edad + " años.");

        System.out.println("Nombre: " + mascota2.nombre + ", especie: " + mascota2.especie + ", edad: " + mascota2.edad + " años.");

        System.out.println("Nombre: " + mascota3.nombre + ", especie: " + mascota3.especie + ", edad: " + mascota3.edad + " años.");
    }
}
