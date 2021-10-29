/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointegrador.dao;

import projetointegrador.model.Enderecos;
/** 
 *
 * @author acer
 */
public class TesteDAO {
    public static void main(String[] args) {
        Enderecos enderecoTeste = new Enderecos();
        
        enderecoTeste.setCep("89882120");
        enderecoTeste.setBairro("Jardim América");
        enderecoTeste.setComplemento("E");
        enderecoTeste.setCidade("Chapecó");
        enderecoTeste.setNumero(390);
        enderecoTeste.setRua("Mascarenhas de Moraes");
        enderecoTeste.setUF("sc");
        
        EnderecosDAO dao = new EnderecosDAO();
        dao.cadastrarEndereco(enderecoTeste);
    }
   
    
}

