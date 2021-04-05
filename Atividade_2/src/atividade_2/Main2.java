/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_2;

/**
 *
 * @author afons
 */
public class Main2 {

    public static void main(String[] args) {
        
        //nome salario cargo
        Comum c1 = new Comum ("Ralph José", 1300.00, "Engenheiro");
        Comum c2 = new Comum ("Francisca", 9000.09, "Secretario(a)");
        Gerente g1 = new Gerente ("Kadu", 500.57, "Gerente");
        Diretor d1 = new Diretor ("Zé", 2875.12, "Diretor");
        c1.bonificacao();
        c2.bonificacao();
        d1.bonificacao();
        g1.bonificacao();
        
    }
    
}
