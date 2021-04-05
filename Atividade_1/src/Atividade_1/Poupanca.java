/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

public class Poupanca extends Conta{
    
private double saldoPoupanca;

public void Sacar (double saldo) {
    if (saldo >= this.saldo) {
        System.out.println("saldo da conta insuficiente para realizar o saque");
    }else{
        this.saldo = this.saldo - saldo;
        System.out.println(this.saldo);   
    }
}
public void Sacar (boolean Poupanca, double saldo) {
    if (saldo >= this.saldoPoupanca) {
        System.out.println("saldo da poupança insuficiente para realizar o saque");
    }else{
        this.saldoPoupanca = this.saldoPoupanca - saldo;
        System.out.println(this.saldoPoupanca);   
    }
} 

    public Poupanca(double saldoPoupanca, String nome, int cc, double saldo) {
        super(nome, cc, saldo);
        this.saldoPoupanca = saldoPoupanca;
    }
    

    public void tipoConta () {
        System.out.println("Conta poupança");
    }       
        
}
