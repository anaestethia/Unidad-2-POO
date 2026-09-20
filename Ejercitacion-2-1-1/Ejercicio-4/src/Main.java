public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(12.4, 24.1);
        double resta = calculadora.restar(44.6, 97.3);
        double multiplicacion = calculadora.multiplicar(22.1, 42.3);
        double division = calculadora.dividir(13.4, 2.3);
        double divisionxcero = calculadora.dividir(12.4, 0.0);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("División por cero: " + divisionxcero);
    }
}
