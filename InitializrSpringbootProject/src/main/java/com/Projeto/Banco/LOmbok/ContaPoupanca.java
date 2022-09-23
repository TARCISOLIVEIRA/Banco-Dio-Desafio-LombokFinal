/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projeto.Banco.LOmbok;

/**
 *
 * @author NevesRibeiro
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        
        System.out.println("Extrato poupanca");
        super.ImprimirComuns();
        
       
    }
    
}
