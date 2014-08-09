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
class TesteContaCorrente {

    public static void main(String[] args){
        Conta conta = ContaCorrente.criar();
        conta.deposita(1000);
        
        boolean valorSaldoValido = 1000 == conta.getSaldo();
        
        System.out.println(valorSaldoValido);
    }
    
}
