public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.setTitular("Franco");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo()); cuenta.depositar(10000);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo()); cuenta.retirar(3000);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo()); cuenta.retirar(10000);
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}