/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperatorio_02_di_camillo_marcos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dicam
 */
public class Recuperatorio_02_Di_Camillo_Marcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objetos que tendran el nombre y dni  de las secretarias
       Persona secretario1 = new Persona("Alegandra Vallejos", "40.567.453") {};
       Persona secretario2 = new Persona("Josefina Petri", "38.557.876") {};
       
        //objetos que tendran la especialidad
        Especialidad especialidad1 = new Especialidad("Clinica");
        Especialidad especialidad2 = new Especialidad("Traumatologia");
        Especialidad especialidad3 = new Especialidad("Cardiologia");
        
        
        //nombre, cantidad y valor de los recursos
        Recursos recurso1 = new Recursos("Computadoras", 20, 600.000);
        Recursos recurso2 = new Recursos("Equipos ", 5, 70.000);

        Profesional profesional1 = new Profesional("Dr.José Gonzales", "30.943.840", "2213", especialidad1);
        Profesional profesional2 = new Profesional("Dr.Esteban Gimenez", "40.456.718", "5564", especialidad2);

        Paciente paciente1 = new Paciente("Lopez Alberto", "27439097");
        Paciente paciente2 = new Paciente("Lopez Alberto", "27439097");

        Turno turno1 = new Turno(1, "15/08/2023", paciente1, secretario1);
        Turno turno2 = new Turno(2, "16/09/2023", paciente1, secretario2);

       //en este arraylist se guardaran los turnos
        List<Turno> turnos = new ArrayList<>();
        turnos.add(turno1);
        turnos.add(turno2);

        
        listar_paciente(turnos, "Lopez Alberto");

      
        listar_profesional(turnos, "Jose Gonzales", "2213");

        
        Monto_Recursos(recurso1, recurso2);
    }
    
    //este metodo se encargar de lista los pacientes, en este caso es lopez alberto
    //mediante un bucle foreach recorro el arraylist y luego con un if condiciono si el nombre que del paciente 
    public static void listar_paciente(List<Turno> turnos, String nombrePaciente) {
        System.out.println("Ejercio n1");
        System.out.println("Turnos reservados por el paciente " + nombrePaciente + ":");
        Collections.sort(turnos, Comparator.comparing(Turno::getFecha));
        for (Turno turno : turnos) {
            if (turno.getPaciente().getNombre().equals(nombrePaciente)) {
                System.out.println("Numero del Turno: " + turno.getNumero());
                System.out.println("Secretaria que agendo el turno: " + turno.getSecretario().getNombre());
                System.out.println("Fecha: " + turno.getFecha());
                System.out.println("--------");
            }
        }
    }

    //creo otro metod que va a ser el encargado de mostrar el profecional, tambien uso un foreach y un if para filtrar el profecional
    
    public static void listar_profesional(List<Turno> turnos, String nombreProfesional, String matricula) {
        
        System.out.println("\nEjercio n2");
        System.out.println("Turnos reservados por el profesional " + nombreProfesional + " (Numero de  matricula: " + matricula + "):");
        for (Turno turno : turnos) {
            if (turno.getSecretario() instanceof Profesional) {
                Profesional profesional = (Profesional) turno.getSecretario();
                if (profesional.getNombre().equals(nombreProfesional) && profesional.getMatricula().equals(matricula)) {
                    System.out.println("Número de Turno: " + turno.getNumero());
                    System.out.println("Fecha: " + turno.getFecha());
                    System.out.println("Paciente: " + turno.getPaciente().getNombre());
                    System.out.println("Especialidad: " + profesional.getEspecialidad().getNombre());
                    System.out.println("--------");
                    System.out.println();
                }
            }
        }
    }
    
    
    
    
    //en este metodo voy a obtener el valor total en pesos sumando el valor en pesos
    //de las computadoras el  valor de recurso1 multiplicado por la cantidad de computadoras
    //y el valor en pesos de los equipos de oficina seria el valor de recurso2 multiplicado por la cantidad de equipos de oficina
    
    public static void Monto_Recursos(Recursos recurso1, Recursos recurso2) {
        System.out.println("\nEjercio n3");
        int totalComputadoras = recurso1.getCantidad();
        int totalEquiposOficina = recurso2.getCantidad();
        double valorTotalEnPesos = recurso1.getValorEnPesos() * totalComputadoras
                + recurso2.getValorEnPesos() * totalEquiposOficina;

        System.out.println("\nCantidad de computadoras: " + totalComputadoras);
        System.out.println("Cantidad de equipos: " + totalEquiposOficina);
        System.out.println("Total en pesos: " + valorTotalEnPesos);
    }
}