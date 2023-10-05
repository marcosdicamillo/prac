/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperatorio_02_di_camillo_marcos;

/**
 *
 * @author dicam
 */

//esta clase es una extencion de la clase padre persona que a su vez tendra sus propios metodos contructor y geters 
class Profesional extends Persona {
    private String matricula;
    private Especialidad especialidad;

    public Profesional(String nombre, String dni, String matricula, Especialidad especialidad) {
        super(nombre, dni);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
