/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;


public class Cirurgiao extends Medico{
    String Especialidade;

    public Cirurgiao(String Especialidade, String Nome, int Crm) {
        super(Nome, Crm);
        this.Especialidade = Especialidade;
    }
    
    @Override
    public void TratarPaciente () {
        System.out.println("Trantando em no minimo 2 horas.");
    }
    
    public void FazerIncisao () {
        System.out.println("Procedimento de incisão iniciada");
    }
}
