public class Contador {
    int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public int incrementar() {
        return this.valor + 1;
    }

    public int decrementar() {
        if (this.valor >= 1) {
            return this.valor - 1;
        }
        return this.valor;
    }

    public int resetear() {
        this.valor = 0;
        return this.valor;
    }

    public int getValor() {
        return this.valor;
    }
}