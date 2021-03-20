/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author afons
 */
public class Condicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1 = 5, n2 = 5, n3 = 9, n4 = 0, media;
        media = (n1+n2+n3+n4)/4;
        if (media >= 7) {
            System.out.println("voce passou");   
            System.out.println("sua media é: " + media);
        }else if (media <= 6 && media >= 5) {
            System.out.println("voce esta de substitutiva");
            System.out.println("sua media é: " + media);
        } else {
            System.out.println("voce reprovou");
            System.out.println("sua media é: " + media);
        }
    }
    
}
