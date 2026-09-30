public class GiftCard {
    private String codigo;
    private double saldo;

    public GiftCard(String codigo, double saldoInicial) {
        this.codigo = codigo;
        this.saldo = Math.max(0, saldoInicial);
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean descontarSaldo(double monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }
}