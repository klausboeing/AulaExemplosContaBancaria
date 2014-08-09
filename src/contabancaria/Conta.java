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
public interface Conta {
  
    void deposita(double valor);

    void saca(double valor);

    double getSaldo();

    void atualiza(double taxa);
    
}
