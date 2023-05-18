/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.Date;


public class Consulta {
    private String dia;
    private String hora;
    private Paciente nomePaciente;
    private Medico nomeMedico;

    
    // Constructor
    public Consulta(String dia, String hora, Paciente nomePaciente, Medico nomeMedico) {
        this.dia = dia;
        this.hora = hora;
        this.nomePaciente = nomePaciente;
        this.nomeMedico = nomeMedico;
    }

    
    // Getters 
    public String getDia() {
        return dia;
    }
    
    
    public String getHora() {
        return hora;
    }
    
    
    public Paciente getNomePaciente() {
        return nomePaciente;
    }
    
    
    public Medico getNomeMedico() {
        return nomeMedico;
    }

    
    // Setters
    public void setDia(String dia) {
        this.dia = dia;
    }
   

    public void setHora(String hora) {
        this.hora = hora;
    }

    
    public void setNomePaciente(Paciente nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    

    public void setNomeMedico(Medico nomeMedico) {
        this.nomeMedico = nomeMedico;
    }
       
    public String toString(){
        return "Dia: " + dia + " hora: " + hora + " " + nomeMedico;
    }
}
