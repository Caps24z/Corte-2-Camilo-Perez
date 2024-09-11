package Clases;

import java.util.ArrayList;
import java.util.List;


public class persona {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private String edad; 
    private static List<String> listaPersonas = new ArrayList<>();

    public persona() {
    }
    
    public persona(String nombre, String apellido, String direccion, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
    }

    
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public String getEdad() { return edad; }

    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setEdad(String edad) { this.edad = edad; }

    
    public void guardarPersona(String nombre, String apellido, String direccion, String edad) {
        String persona = nombre + " " + apellido + ", " + direccion + ", " + edad;
        listaPersonas.add(persona);
    }

        public List<String> getListaPersonas() {
        return listaPersonas;
    }
}

