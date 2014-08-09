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
class TesteTributavel {
   
    public static void main(String[] args){
        GerenciadorImpostoRenda gerenciador = new GerenciadorImpostoRenda();
        
        ContaTributavel cc = ContaCorrente.criar();
        SeguroDeVida deVida = new SeguroDeVida();

        gerenciador.registra(cc);
        gerenciador.registra(deVida);
        
    }
    
}
