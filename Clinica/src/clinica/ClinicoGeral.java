package clinica;

public class ClinicoGeral extends Medico{
    boolean AtendeEmCasa;
    
    public ClinicoGeral(boolean AtendeEmCasa, String Nome, int Crm) {
        super(Nome, Crm);
        this.AtendeEmCasa = AtendeEmCasa;
    }
  
    @Override
    public void TratarPaciente () {
        System.out.println("Trantando em no maximo 10 min.");
    }
    
    public void Receitar (String Receitar, boolean Doenca1){
        System.out.println("1 doença");
    }
    public void Receitar (String Receitar, boolean Doenca1, boolean Doenca2){
        System.out.println("2 doenças");
    }
    public void Receitar (String Receitar, boolean Doenca1, boolean Doenca2, boolean Doenca3){
        System.out.println("3 doenças");
    }
}