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
class GerenciadorImpostoRenda {

    private double totalImpostos;
    
    public void registra(Tributavel tributavel){
        totalImpostos += tributavel.calculaTributos();
    }
    
    public double getTotalImpostos() {
        return totalImpostos;
    }
    
}
