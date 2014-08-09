package contabancaria;

class ContaImpl {

    protected double saldo;

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
