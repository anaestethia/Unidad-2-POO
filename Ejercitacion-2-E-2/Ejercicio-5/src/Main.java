public class Main {
    public static void main(String[] args) {
        SocioGeek socio = new SocioGeek(1042, "Lucia", 120);

        System.out.println("Socio: " + socio.getNumeroSocio() + " - " + socio.getNombre());
        socio.setPuntosFidelidad(180);
        System.out.println("Puntos despues de asignar un valor valido: " + socio.getPuntosFidelidad());

        socio.setPuntosFidelidad(-25);
        System.out.println("Puntos despues de intentar asignar un valor negativo: "
                + socio.getPuntosFidelidad());
    }
}