/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaSubclases;

/**
 *
 * @author juanel
 */
public class Empleado extends Persona{
        private String idEmpleado;
        private String puesto;
        private int salario;
    
    public Empleado(String nombre, String apellido, int edad, String sexo, String fechaNacimiento, String cedula, String numeroTel, String correo, String ubicacion, String idEmpleado, String puesto, int salario){
        super(nombre, apellido, edad, sexo, fechaNacimiento, cedula, numeroTel, correo, ubicacion);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    public void solicitarPermiso(){
            }

}
