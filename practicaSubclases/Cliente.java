/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaSubclases;

/**
 *
 * @author juanel
 */
public class Cliente extends Persona{
    public Cliente(String nombre, String apellido, int edad, String sexo, String fechaNacimiento, String cedula, String numeroTel, String correo, String ubicacion) {
        super(nombre, apellido, edad, sexo, fechaNacimiento, cedula, numeroTel, correo, ubicacion);
    }
    
    private int idCliente;
    
    
}
