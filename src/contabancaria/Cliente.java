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
public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;

    /*Outros atributos*/
    
    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
    
    /*Outros métodos*/

}
