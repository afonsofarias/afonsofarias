
package aula2;

// Visibilidade -> class -> Nome da classe

public class Pessoa {

//     Atributos
   public String nome;
    
   public int idade;
    
   public String sexo;

//    Metodos -> Ação
//   visibilidade | retorno do metodo | nome () {}
   public void fazerAniversario(){
   
       System.out.println("Parabéns pra você...");
       
       idade = idade + 1;
       
       System.out.println("Voce agora tem :" + idade + " anos");
   }
}