public class Personaje {
    String nombre;
    int puntosDeVida;
    int puntosDeAtaque;

    public Personaje(String nombre, int puntosDeVida, int puntosDeAtaque) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public void atacar(Personaje objetivo) {
        objetivo.puntosDeVida -= puntosDeAtaque;
        System.out.println(nombre + " atacó a " + objetivo.nombre + " y le quitó " + puntosDeAtaque + " puntos de vida.");
    }

    public boolean estaVivo() {
        if (puntosDeVida > 0) {
            System.out.println(nombre + " está vivo con " + puntosDeVida + " puntos de vida.");
            return true;
        } else {
            System.out.println(nombre + " ha sido derrotado.");
            return false;
        }
    }
}
