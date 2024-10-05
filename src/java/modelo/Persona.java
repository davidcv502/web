/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author David Valenzuela
 */
abstract class Persona {
    private int id;
    private String nombres, apellidos, direccion, telefono, fehca_naciemiento;
    public Persona(){}
    public Persona(int id, String nombres, String apellidos, String direccion, String telefono, String fehca_naciemiento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fehca_naciemiento = fehca_naciemiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFehca_naciemiento() {
        return fehca_naciemiento;
    }

    public void setFehca_naciemiento(String fehca_naciemiento) {
        this.fehca_naciemiento = fehca_naciemiento;
    }
    public int agregar(){
    return 0;
    }
    public int modificar(){return 0;}
    public int eliminar(){return 0;}
}
