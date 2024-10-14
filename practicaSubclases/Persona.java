/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practicaSubclases;

/**
 *
 * @author juanel
 */
public class Persona{
    
    // atributos
    
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private String fechaNacimiento;   
    private String cedula;
    private String numeroTel;
    private String correo;
    private String ubicacion;
    
    //metodo constructor
    
    public Persona (String nombre, String apellido, int edad, String sexo, String fechaNacimiento, String cedula, String numeroTel, String correo, String ubicacion){  
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.numeroTel = numeroTel;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    //getter y setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
    
}
