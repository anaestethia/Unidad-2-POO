public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.setTitular("Franco");
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        cuenta1.depositar(10000);
        System.out.println("Saldo después del depósito: " + cuenta1.getSaldo());

        cuenta1.retirar(3000);
        System.out.println("Saldo después del retiro: " + cuenta1.getSaldo());

        cuenta1.retirar(10000);
        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}