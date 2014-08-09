/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Klaus Boeing
 */
public class ContaCorrenteTest {

    @Test
    public void devePossuirSaldoPositivo(){
        Conta conta =  ContaCorrente.criar();
        conta.deposita(1000);
        conta.deposita(-1000);

        Assert.assertTrue(conta.getSaldo() >= 0);
    }        
    
    @Test
    public void naoDeveDepositarUmaValorNegativoParaUmaContaComSaldo(){
        Conta conta = ContaCorrente.criar();
        conta.deposita(1000);
        conta.deposita(-1000);

        Assert.assertEquals(1000, conta.getSaldo(), 0.0001);
    }    
    
    @Test
    public void naoDeveDepositarUmaValorNegativo(){
        Conta conta = ContaCorrente.criar();
        conta.deposita(-1000);

        Assert.assertEquals(0, conta.getSaldo(), 0.0001);
    }
    
    @Test
    public void deveDepositarUmValor() {
        Conta conta = ContaCorrente.criar();
        conta.deposita(1000);

        Assert.assertEquals(1000, conta.getSaldo(), 0.0001);
    }

}
