/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

/**
 *
 * @author Klaus Boeing
 */
class HistoricoOperacao {

    private String operacao;
    
    private double saldoAnterior;
    
    private double saldoAtual;
    
    private double valorOperacao;

    public HistoricoOperacao(String operacao, double saldoAnterior, double saldoAtual, double valorOperacao) {
        this.operacao = operacao;
        this.saldoAnterior = saldoAnterior;
        this.saldoAtual = saldoAtual;
        this.valorOperacao = valorOperacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    @Override
    public String toString() {
        return "HistoricoOperacoes{" + "operacao=" + operacao + ", saldoAnterior=" + saldoAnterior + ", saldoAtual=" + saldoAtual + ", valorOperacao=" + valorOperacao + '}';
    }
    
}
