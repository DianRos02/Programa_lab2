/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

import zoologico.entidades.zoologico;
import zoologico.entidades.Cuidador;
import zoologico.entidades.Persona;

/**
 *
 * @author DIANA
 */
public class Programa1 {
    

    public static void main(String[] args) {
        zoologico z=new zoologico();
        
    z.abrir();
    
    System.out.println("---------------------");
    
    System.out.println("Alimentar animales");
    z.alimentarAnimales(125);
    
    System.out.println("---------------------");
    z.cerrar();
    
            
        
    }
 
    
    
    

}
