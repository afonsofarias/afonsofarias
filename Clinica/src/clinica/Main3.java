
package clinica;

/**
 *
 * @author afons
 */
public class Main3 {
    
    public static void main(String[] args) {
        
        System.out.println("Atendendo um paciente");
        
        ClinicoGeral cl1 = new ClinicoGeral(true, "João", 25643);
        cl1.TratarPaciente();
        cl1.Receitar("Cirrose", true, true);
        
        System.out.println("\n---------------------------------\n");
        
        System.out.println("Atendendo um paciente encaminhado para cirurgia");
        
        Cirurgiao ci1 = new Cirurgiao ("Proctologista", "Clodoaldo", 123456);
        ci1.TratarPaciente();
        ci1.FazerIncisao();
        
        System.out.println("Encaminhado para clinico Geral ");
    }   
}
