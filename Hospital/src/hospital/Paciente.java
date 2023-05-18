/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;


public class Paciente {
    private String nomePaciente;
    private String telefone;

    
    // Constructor
    public Paciente(String nomePaciente, String telefone) {
        this.nomePaciente = nomePaciente;
        this.telefone = telefone;
    }

    
    // Getters
    public String getNomePaciente() {
        return nomePaciente;
    }
    
    
    public String getTelefone() {
        return telefone;
    }
    
    
    // Setters
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

        
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return "Paciente: " + nomePaciente;
    }
}
