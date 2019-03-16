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
public class Deportista extends Persona {
    
    public Deportista (){
        setNombre("Dania Pineda ");
        setSexo("Femenino ");
        setEdad("33 años ");
    }

    @Override
    public String getInformacionPersona() {
    return "Deportista ";   
    }
}
