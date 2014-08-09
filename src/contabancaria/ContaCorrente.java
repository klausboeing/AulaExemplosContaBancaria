package contabancaria;

public class ContaCorrente implements ContaTributavel{

    private ContaImpl contaImpl = new ContaImpl();

    private ContaCorrente() {
    }

    public static ContaTributavel criar(){
        return new RegistroOperacoesConta(new ContaCorrente());
    }
    
    @Override
    public void deposita(double valor) {
        contaImpl.deposita(valor);
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
        double saldo = contaImpl.getSaldo() + contaImpl.getSaldo() * taxa * 2;
        contaImpl.setSaldo(saldo);
        
    }

    @Override
    public double calculaTributos() {
        return 12.0;
    }

}
