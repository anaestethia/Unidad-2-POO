public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double suma = calculadora.sumar(12.4,24.1);
        double resta = calculadora.restar(44.6,97.3);
        double multiplicacion = calculadora.multiplicar(22.1,42.3);
        double division = calculadora.dividir(13.4,2.3);
        double divisionxcero = calculadora.dividir(12.4,0.0);

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(division);
        System.out.println(multiplicacion);
        System.out.println(divisionxcero);
    }
}
