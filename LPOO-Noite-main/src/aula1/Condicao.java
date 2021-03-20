/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author anderson
 */
public class Condicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Estrutura de Condição ---");

        double media = 8;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        String usuario = "afonsofaria@hotamail.com.br";
        String senha = "flamengosfdgfgd";

        if (usuario == "afonsofaria@hotamail.com.br" && senha == "flamengo") {
            System.out.println("Entrando no Facebook");
        } else {
            System.out.println("Usuario ou senha invalidos");
        }

//        int i;
//        
//        String  =null;
//        
//        if (i % 2  == 0){
//            System.out.println("Par");
//        }else {
//            System.out.println("Impar");
//        }
//        if (usuario == "afonsofaria@hotamail.com.br") {
//            System.out.println("Usuario existente");
//
//            if (senha == "flamengo") {
//                System.out.println("Entrando no facebook....");
//            } else {
//                System.out.println("Senha incorreta");
//            }
//
//        } else {
//            System.out.println("Usuario nao cadastrado");
//        }
// switch 
        System.out.println("");
        System.out.println("----- switch ------");

        int mes = 20;

        switch (mes) {

            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Fev");
                break;
            case 3:
                System.out.println("Março");
                break;
            default:
                System.out.println("Mes inexistente");

        }

    }
}
