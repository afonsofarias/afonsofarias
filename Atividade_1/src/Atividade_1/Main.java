/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade_1;

/**
 *
 * @author afons
 */
public class Main {

    public static void main(String[] args) {
        
        Conta c1 = new Conta ("Nicole", 12345, 10.00);
        
        Especial e1 = new Especial (500.00, "Sophia", 54321, 20.00);
        
        Poupanca p1 = new Poupanca (20.00, "Danielle", 34512, 30.00);
    
        Universitaria u1 = new Universitaria (5.00, "Afonso", 45123, 40.00);
    
        c1.deposito(32.50);
        c1.tipoConta();
        System.out.println("\n----------\n");
        e1.Sacar(300);
        e1.Sacar(true, 280.00);
        e1.tipoConta();
        System.out.println("\n----------\n");
        p1.Sacar(40);
        p1.Sacar(true, 10.00);
        p1.tipoConta();
        System.out.println("\n----------\n");
        u1.deposito(100);
        u1.tipoConta();
    }
}