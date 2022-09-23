/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Projeto.Banco.LOmbok;


public interface InterfConta {
    
      
    void sacar(double valor);
        
    
    void depositar(double valor);
        
    
    void transferir(double valor, Conta contaDestino);
    
    void  imprimirExtrato();
        
    
    
    
}
