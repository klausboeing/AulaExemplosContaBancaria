/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Klaus Boeing
 */
class RegistroOperacoesConta implements ContaTributavel{

    private List<HistoricoOperacao> operacoes = new ArrayList<HistoricoOperacao>();
    private Conta conta;
    private Tributavel tributavel;

    public RegistroOperacoesConta(ContaTributavel contaTributavel) {
        this.conta = contaTributavel;
        this.tributavel = contaTributavel;
    }
    
    public RegistroOperacoesConta(Conta conta) {
        this.conta = conta;
    }
    
    @Override
    public void deposita(double valor) {
        double saldoAnterior = conta.getSaldo();
        
        conta.deposita(valor);
        
        double saldoAtual = conta.getSaldo();
        double valorOperacao = valor;
        
        HistoricoOperacao historicoOperacao = new HistoricoOperacao("deposito", saldoAnterior, saldoAtual, valorOperacao);
        registraHistorico(historicoOperacao);
    }

    @Override
    public void saca(double valor) {
        double saldoAnterior = conta.getSaldo();
        
        conta.saca(valor);
        
        double saldoAtual = conta.getSaldo();
        double valorOperacao = valor;
        
        HistoricoOperacao historicoOperacao = new HistoricoOperacao("saque", saldoAnterior, saldoAtual, valorOperacao);
        registraHistorico(historicoOperacao);
    }

    @Override
    public double getSaldo() {
        return conta.getSaldo();
    }

    @Override
    public void atualiza(double taxa) {
        double saldoAnterior = conta.getSaldo();
        
        conta.atualiza(taxa);
        
        double saldoAtual = conta.getSaldo();
        double valorOperacao = taxa;
        
        HistoricoOperacao historicoOperacao = new HistoricoOperacao("atualização", saldoAnterior, saldoAtual, valorOperacao);
        registraHistorico(historicoOperacao);
    }

    public List<HistoricoOperacao> getOperacoes() {
        return operacoes;
    }

    @Override
    public double calculaTributos() {
        return tributavel.calculaTributos();
    }

    private void registraHistorico(HistoricoOperacao historicoOperacao){
        System.out.println(historicoOperacao);
        operacoes.add(historicoOperacao);
    }
    
}
