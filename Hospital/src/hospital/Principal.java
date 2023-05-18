/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Paciente pacienteRenato = new Paciente("Renato", "9987598428");
        Medico medicoMateus = new Medico("Mateus", "cardiologista");
        Consulta consultaDoDia = new Consulta ("18/05/2023", "8:00", pacienteRenato, medicoMateus);
        
        hospital.cadastrarPaciente(pacienteRenato);
        hospital.cadastrarMedico(medicoMateus);
        hospital.cadastrarConsulta(consultaDoDia);
        
        System.out.println(hospital.buscarPaciente("Renato"));
        System.out.println(hospital.buscarMedico("Mateus"));
        System.out.println(hospital.buscarConsulta("18/05/2023", pacienteRenato));
        
        
        
    }
    
}
