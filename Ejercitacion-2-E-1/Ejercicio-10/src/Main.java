public class Main {
	public static void main(String[] args) {
		Personaje jugador1 = new Personaje("Guerrero", 100, 20);
		Personaje jugador2 = new Personaje("Orco", 80, 15);
		int turno = 1;

		mostrarPanelPersonajes(jugador1, jugador2);

		while (jugador1.puntosDeVida > 0 && jugador2.puntosDeVida > 0) {
			mostrarPanelTurno(turno, jugador1, jugador2);
			jugador1.atacar(jugador2);

			if (jugador2.puntosDeVida > 0) {
				jugador2.atacar(jugador1);
			}

			System.out.println("+--------------------------------------------------+");
			turno++;
		}

		System.out.println("\n+------------------- FIN DEL COMBATE -------------------+");
		jugador1.estaVivo();
		jugador2.estaVivo();

		if (jugador1.puntosDeVida > 0) {
			System.out.println("| Ganador: " + jugador1.nombre);
		} else if (jugador2.puntosDeVida > 0) {
			System.out.println("| Ganador: " + jugador2.nombre);
		} else {
			System.out.println("| El combate terminó en empate.");
		}
		System.out.println("+-------------------------------------------------------+");
	}

	private static void mostrarPanelPersonajes(Personaje jugador1, Personaje jugador2) {
		System.out.println("+--------------------------------------------------+");
		System.out.println("|               PERSONAJES DEL COMBATE            |");
		System.out.println("+--------------------------------------------------+");
		System.out.println("| " + jugador1.nombre + " | Vida: " + jugador1.puntosDeVida
				+ " | Ataque: " + jugador1.puntosDeAtaque + " |");
		System.out.println("| " + jugador2.nombre + "    | Vida: " + jugador2.puntosDeVida
				+ " | Ataque: " + jugador2.puntosDeAtaque + " |");
		System.out.println("+--------------------------------------------------+\n");
	}

	private static void mostrarPanelTurno(int turno, Personaje jugador1, Personaje jugador2) {
		System.out.println("+---------------------- TURNO " + turno + " ----------------------+");
		System.out.println("| " + jugador1.nombre + ": " + jugador1.puntosDeVida + " PV"
				+ "  |  " + jugador2.nombre + ": " + jugador2.puntosDeVida + " PV |");
		System.out.println("+--------------------------------------------------+");
	}
}
