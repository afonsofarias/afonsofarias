/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

public class Conta {
protected String nome;
protected int cc;
protected double saldo;

    public Conta(String nome, int cc, double saldo) {
        this.nome = nome;
        this.cc = cc;
        this.saldo = saldo;
    }
    public void tipoConta () {
        System.out.println("Conta corrente");
    }
    
    public void deposito (double saldoDeposito) {
        
    }
}

