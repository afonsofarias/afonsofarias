/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

public class Universitaria extends Conta{
    
private double saldoUniversitario;
    
@Override
public void deposito (double deposito) {
    System.out.println("Saldo atual " + this.saldoUniversitario);
    this.saldoUniversitario += (deposito + ((deposito / 100)*5));
    System.out.println("seu saldo apos o deposito é: " + this.saldoUniversitario);
}

    public Universitaria(double saldoUniversitario, String nome, int cc, double saldo) {
        super(nome, cc, saldo);
        this.saldoUniversitario = saldoUniversitario;
    }

@Override
    public void tipoConta () {
        System.out.println("Conta universitaria");
    }       
        
}
