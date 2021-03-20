
package aula1;


public class Variaveis {


    public static void main(String[] args) {
       //  Imprima na saida do sistema o texto Ola mundo
        System.out.println("Ola Mundo");

//   Mágica da IDE = sout + tab
        System.out.println("Ihuuu, assim fica fácilll");

//        Váriavel | 1º Tipo e depois o nome
        int idade; //Armazenar valores inteiros

        double altura; // Armazenar valores com casas decimais

        String nome; //Armazenar Textos

        boolean feliz; // Armazenar true ou false

        char sexo; // Armazenar apenas um caracter

//     Inserção de valores nas variáveis
        idade = 10;

        altura = 1.80;

        nome = "Anderson";

        feliz = false;

        sexo = 'M';

//    Mostrar Valores
        System.out.println("--- Dados Pessoais ---");

        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("É feliz? " + feliz);
        System.out.println("Sexo: " + sexo);

        System.out.println("Nome " + nome + " Altura: " + altura + ""
                + " Idade: " + " Feliz? " + feliz + " Sexo: " + sexo);
        
        
        //        Operadores
        System.out.println("------- Operadores ----------");
        int soma = 10 + 5;

        System.out.println("A soma é: " + soma);

        double nota1 = 5;

        double nota2 = 6;

        double media = (nota1 + nota2) / 2;

        System.out.println("A media é: " + media);
    }
    
}
