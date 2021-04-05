/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

public class Especial extends Conta{
    
private double limite;

public void Sacar (double saldo) {
    if (saldo >= this.saldo) {
        System.out.println("Limite insuficiente para realizar o saque");
    }else{
        this.saldo = this.saldo - saldo;
        System.out.println(this.saldo);   
    }
}
public void Sacar (boolean limite, double saldo) {
    if (saldo >= this.limite) {
        System.out.println("Limite insuficiente para realizar o saque");
    }else{
        this.limite = this.limite - saldo;
        System.out.println(this.limite);   
    }
}   

    public Especial(double limite, String nome, int cc, double saldo) {
        super(nome, cc, saldo);
        this.limite = limite;
    }

@Override
    public void tipoConta () {
        System.out.println("Conta especial");
    }              
}
    