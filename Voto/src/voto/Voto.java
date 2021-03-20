/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voto;

import java.util.Scanner;

/**
 *
 * @author afons
 */
public class Voto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 0;

        System.out.println("Checagem eleitoral!");
        System.out.print("\nQual a sua idade? ");
        Scanner scan = new Scanner(System.in);
        idade = scan.nextInt();
        scan.close();

        if (idade < 16 || idade > 150) {
            System.out.println("\n*******************************************\nVocê não esta apto para votar!\n\nProcure uma fralda que é melhor!");
        } else {
            if (idade > 15 && idade < 18) {
                System.out.println("\n*******************************************\nVocê esta apto para votar!\n\nPorem seu voto é facultativo!");
            } else {
                if (idade > 17 && idade < 66) {
                    System.out.println("\n*******************************************\nVocê está apto a votar!\n\nO voto é obrigatorio para a sua idade!");
                } else {
                    System.out.println("\n*******************************************\nVocê esta apto para votar!\n\nPorem seu voto é facultativo!");
                }
            }
        }
    }
}
