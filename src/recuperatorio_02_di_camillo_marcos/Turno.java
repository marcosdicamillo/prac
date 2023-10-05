/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperatorio_02_di_camillo_marcos;

/**
 *
 * @author dicam
 */

//en esta clase van a estar los atributos, metodods y getters, que guardaran la informacion del turno especifico
class Turno {
    private int numero;
    private String fecha;
    private Paciente paciente;
    private Persona secretario;

    public Turno(int numero, String fecha, Paciente paciente, Persona secretario) {
        this.numero = numero;
        this.fecha = fecha;
        this.paciente = paciente;
        this.secretario = secretario;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Persona getSecretario() {
        return secretario;
    }
}
