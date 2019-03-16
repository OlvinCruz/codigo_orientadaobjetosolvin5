/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Olvin
 */
public abstract class Persona {
    //atributos
    private String nombre;
    private String sexo;
    private String edad;
    
    public Persona (){
        
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
     public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
     public void setEdad(String edad){
        this.edad = edad;
    }
    public String getEdad(){
        return this.edad;
    }
    
    public void ImprimirInformacion(){
        System.out.println("Nombre: "+ nombre );
        System.out.println("Sexo: "+ sexo );
        System.out.println("Edad: "+ edad );
    }
    
    abstract String getInformacionPersona();
}

