/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana;

import java.util.Scanner;

/**
 *
 * @author afons
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = 0;
        
        System.out.print("Digite o numero do dia da semana desejado: ");
        Scanner scan = new Scanner(System.in);
        dia = scan.nextInt();
        scan.close();
        
        switch (dia) {
            case 1:
                System.out.println("domingo\nNão e dia util");
                break;
            case 2:
                System.out.println("Segundo\nÉ dia util");
                break;
            case 3:
                System.out.println("Terça\nÉ dia util");
                break;
            case 4:
                System.out.println("Quarta\nÉ dia util");
                break;
            case 5:
                System.out.println("Quinta\nÉ dia util");
                break;
            case 6:
                System.out.println("Sexta\nÉ dia util");
                break;
            case 7:
                System.out.println("Sabado\nNão e dia util");
                break;
            default:
                    System.out.println("valor invalido!");
            }
    }
    
}
