package contabancaria;

class TesteContas {

    public static void main(String[] args) {
        Conta cc = ContaCorrente.criar();
        Conta cp = ContaPoupanca.criar();
//        Conta cc = new ContaCorrente();
//        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println("Conta Corrente: " + cc.getSaldo());
        System.out.println("Conta Poupanca: " + cp.getSaldo());
        
//        for (HistoricoOperacao historicoOperacao: cc.getOperacoes()){
//            System.out.println(historicoOperacao);
//        }
//        
//        for (HistoricoOperacao historicoOperacao: cp.getOperacoes()){
//            System.out.println(historicoOperacao);
//        }
        
    }
}
