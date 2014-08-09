/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import contabancaria.Conta;
import contabancaria.ContaCorrente;


/**
 *
 * @author Klaus Boeing
 */
class TesteCaixaEletronico {
    public static void main(String[] args) {
        Conta cc = ContaCorrente.criar();
        cc.deposita(1000);
        
        double valorSaque = 10000;
        cc.saca(valorSaque);
        
        CaixaEletronico ce = new CaixaEletronico();
        ce.ejetarValor(valorSaque);
    }
}
