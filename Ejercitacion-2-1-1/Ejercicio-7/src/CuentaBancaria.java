public class CuentaBancaria{
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
        }
    }

    public void retirar(double monto){
        if(monto <= saldo){
            saldo -= monto;
        }
        else{
            System.out.println("Fondos insuficientes");
        }
    }
}