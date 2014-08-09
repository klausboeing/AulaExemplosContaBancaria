package contabancaria;

public class ContaPoupanca implements Conta {

    public static final int VALOR_PADRAO_MULTIPLICACAO = 3;

    public static final double VALOR_DESCONTO_DEPOSITO = 0.10;

    private ContaImpl contaImpl = new ContaImpl();

    private ContaPoupanca() {
    }

    public static Conta criar() {
        return new RegistroOperacoesConta(new ContaPoupanca());
    }

    @Override
    public void saca(double valor) {
        contaImpl.saca(valor);
    }

    @Override
    public double getSaldo() {
        return contaImpl.getSaldo();
    }

    @Override
    public void atualiza(double taxa) {
        double saldo = contaImpl.getSaldo() + contaImpl.getSaldo() * taxa * VALOR_PADRAO_MULTIPLICACAO;
        contaImpl.setSaldo(saldo);
    }

    @Override
    public void deposita(double valor) {
        double saldo = contaImpl.getSaldo() + valor - VALOR_DESCONTO_DEPOSITO;
        contaImpl.setSaldo(saldo);
    }

}
