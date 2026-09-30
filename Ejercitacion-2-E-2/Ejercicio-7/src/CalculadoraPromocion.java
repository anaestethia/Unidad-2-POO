public class CalculadoraPromocion {
    private double descuentoBase;

    public CalculadoraPromocion(double descuentoBase) {
        if (descuentoBase >= 0 && descuentoBase <= 100) {
            this.descuentoBase = descuentoBase;
        } else {
            this.descuentoBase = 0;
        }
    }

    public double calcularPrecioFinal(double precioBase) {
        return aplicarDescuentoPorcentual(precioBase, descuentoBase);
    }

    public double calcularPrecioFinal(double precioBase, double porcentajeEspecial) {
        return aplicarDescuentoPorcentual(precioBase, porcentajeEspecial);
    }

    public double calcularPrecioFinal(double precioBase, int cuponFijo) {
        if (precioBase < 0 || cuponFijo < 0) {
            return 0;
        }
        return Math.max(0, precioBase - cuponFijo);
    }

    private double aplicarDescuentoPorcentual(double precioBase, double porcentaje) {
        if (precioBase < 0 || porcentaje < 0 || porcentaje > 100) {
            return 0;
        }
        return precioBase * (1 - porcentaje / 100);
    }
}