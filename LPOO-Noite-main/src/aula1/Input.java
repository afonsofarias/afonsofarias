package aula1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
//         como receber dados digitados pelo usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        String nome   =  sc.nextLine();
        
        System.out.println("Altura:");
        float altura  =  sc.nextFloat();
        
        System.out.println("Feliz?");
        boolean feliz =  sc.nextBoolean();
        
        System.out.println("Peso:");
        double peso   =  sc.nextDouble();
        
        System.out.println("Idade:");
        int idade     =  sc.nextInt();

        System.out.println("--- Dados Pessoais ---");

        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("É feliz? " + feliz);

    }

}
