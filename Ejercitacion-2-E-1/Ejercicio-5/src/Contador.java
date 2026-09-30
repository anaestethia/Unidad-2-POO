public class Contador {
    int valor;

    public Contador() {
        this.valor = 0;
    }

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }

    public int incrementar() {
        this.valor++;
        return this.valor;
    }

    public int decrementar() {
        if (this.valor >= 1) {
            this.valor--;
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