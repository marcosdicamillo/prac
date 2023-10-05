/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperatorio_02_di_camillo_marcos;

/**
 *
 * @author dicam
 */
//en esta clase van a a estar los atributos y metodos que corresponda a todod los recursos de la clinica
class Recursos {
    private String nombre;
    private int cantidad;
    private double valorEnPesos;

    public Recursos(String nombre, int cantidad, double valorEnPesos) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorEnPesos = valorEnPesos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorEnPesos() {
        return valorEnPesos;
    }
}