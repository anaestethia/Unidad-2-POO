public class Calculadora {
    public double sumar(double n1, double n2) {
        return n1 + n2;
    }

    public double restar(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        if (n2 == 0.0) {
            System.out.println("No se puede dividir por cero.");
        }
        return n1/n2;
        }
    }
}
