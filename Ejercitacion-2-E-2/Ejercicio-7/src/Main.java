public class Main {
    public static void main(String[] args) {
        CalculadoraPromocion calculadora = new CalculadoraPromocion(10);
        double precioBase = 20000.0;

        System.out.println(String.format("Precio con descuento base: $%.2f",
                calculadora.calcularPrecioFinal(precioBase)));
        System.out.println(String.format("Precio con descuento especial: $%.2f",
                calculadora.calcularPrecioFinal(precioBase, 25.0)));
        System.out.println(String.format("Precio con cupon fijo: $%.2f",
                calculadora.calcularPrecioFinal(precioBase, 3000)));
    }
}