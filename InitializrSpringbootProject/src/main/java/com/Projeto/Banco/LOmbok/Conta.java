/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Projeto.Banco.LOmbok;

/**
 *
 * @author NevesRibeiro
 */
public abstract class Conta implements InterfConta {
    private static final int AGENCIA_PADRAO=1;
    private static  int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;  
    protected Cliente cliente;
    
  
    
    public Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRAO; 
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        
    }
        

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
   

    
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        
    }
    public void ImprimirComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("numero: %d", this.numero));
        System.out.println(String.format("saldo: %.2f" ,this.saldo));
    }
    
}
