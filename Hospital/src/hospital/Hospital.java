/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.Date;

public class Hospital {
    
    private ArrayList<Paciente> pacientes;
    private ArrayList<Medico> medicos;
    private ArrayList<Consulta> consultas;

    public Hospital() {
        this.pacientes = new ArrayList<Paciente>();
        this.medicos = new ArrayList<Medico>();
        this.consultas = new ArrayList<Consulta>();

    }
    
    
    
    // metodo cadastrarPaciente
    public void cadastrarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
    // metodo cadastrarMedico
    public void cadastrarMedico(Medico medico){
        medicos.add(medico);
    }
    
    // metodo cadastrarConsulta
    public void cadastrarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    // metodo buscarPaciente
    public Paciente buscarPaciente(String nomePaciente){
        for (Paciente pac : pacientes){
            if (pac.getNomePaciente().equals(nomePaciente)){
                return pac;
            }
        }
        System.out.println("Paciente nao cadastrado!");
        return null;
    }
    
    // metodo buscarMedico
    public Medico buscarMedico(String nomeMedico){
        for(Medico med : medicos){
            if(med.getNomeMedico().equals(nomeMedico)){
                return med;
            }
            
        }
        System.out.println("Medico nao cadastrado!");
        return null;
    }
    
    // metodo buscarConsulta
    public Consulta buscarConsulta(String dia, Paciente paciente){
        for(Consulta cons : consultas){
            if(cons.getDia().equals(dia) && cons.getNomePaciente() == paciente){
                return cons;
            }
            
        }
        System.out.println("Nao existe consulta marcada!");
        return null;
    }


    
    
        
    
    
}
