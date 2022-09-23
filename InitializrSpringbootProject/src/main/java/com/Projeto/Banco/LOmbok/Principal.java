/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Projeto.Banco.LOmbok;

/**
 *
 * @author NevesRibeiro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente Tarciso = new Cliente ();
        Tarciso.setNome("tarciso");
        
        
        Conta cc = new ContaCorrente(Tarciso);
        cc.depositar(100);
        
        Conta pp = new ContaPoupanca(Tarciso);
        
        cc.transferir(50,pp);
        
        cc.imprimirExtrato();
        pp.ImprimirComuns();
        
        
        
    }
    
}
