
package aula2;

public class Main {

    public static void main(String[] args) {

//            Eu quero criar uma variavel do Tipo Pessoa
            Pessoa p1 = new Pessoa();
       
//            Classe e dentro dela tem varios atributos
//            Inserir valores para dentro do atributo do p1
           p1.nome = "anderson";
           p1.idade = 25;
           p1.sexo = "masculino";
           
           System.out.println("Pessoa 1");
           System.out.println("Nome: " + p1.nome);
           System.out.println("Idade: " + p1.idade);
           System.out.println("Sexo: " + p1.sexo);
           p1.fazerAniversario();
           
           
           Pessoa p2 = new  Pessoa();
           
           p2.nome = "Ilgner";
           p2.idade = 35;
           p2.sexo = "Masculino";
           
           System.out.println("Pessoa 2");
           System.out.println("Nome: " + p2.nome);
           System.out.println("Idade: " + p2.idade);
           System.out.println("Sexo: " + p2.sexo);
           p2.fazerAniversario();
           
           
           
           Cachorro rex = new Cachorro();
           
           rex.raça = "Vira-lata";
           rex.tamanho = 1.8;
           
           System.out.println("Raça do cachorro dele: ");
           System.out.println(rex.raça);
           rex.latir();
           
        
        
        
    }
    
}
