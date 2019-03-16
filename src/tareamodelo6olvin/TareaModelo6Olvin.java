/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodelo6olvin;

import helpers.Deportista;
import helpers.Estudiante;

/**
 *
 * @author Olvin
 */
public class TareaModelo6Olvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante();
        Deportista deportista = new Deportista();
        
        System.out.println("===============================");
        System.out.println("  INFORMACION DE DOS PERSONAS");
        System.out.println("===============================");
        System.out.println(" ");
        System.out.println(estudiante.getInformacionPersona());
        estudiante.ImprimirInformacion();
        System.out.println(" ");
        System.out.println(deportista.getInformacionPersona());
        deportista.ImprimirInformacion();
    }
    
}
