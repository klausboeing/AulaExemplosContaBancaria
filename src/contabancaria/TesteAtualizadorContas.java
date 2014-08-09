package contabancaria;

class TesteAtualizadorContas {

    public static void main(String[] args) {
        Conta cc = ContaCorrente.criar();
        Conta cp = ContaPoupanca.criar();

        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
