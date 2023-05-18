/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;


public class Medico {
    private String nomeMedico;
    private String especializacao;

    
    // Constructor
    public Medico(String nomeMedico, String especializacao) {
        this.nomeMedico = nomeMedico;
        this.especializacao = especializacao;
    }

    
    // Getters
    public String getNomeMedico() {
        return nomeMedico;
    }

    
    public String getEspecializacao() {
        return especializacao;
    }
    
    
    // Setters
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

       
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
     
    public String toString(){
        return "Medico: " + nomeMedico;
    }
    
}
