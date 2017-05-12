/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;


/**
 *
 * @author DIANA
 */
public class Cuidador extends Persona {
       
   private int cantidadDeRaciones;
    
    public Cuidador(String nombre, Date fechaDeNacimiento,int cantidadDeRaciones) {
        super(nombre, fechaDeNacimiento);
        this.cantidadDeRaciones=cantidadDeRaciones;
    }  
    public void alimentarAnimales(){
        if(zoologico.CANTIDAD_ANIMALES * zoologico.RACIONES_POR_ANIMAL <= cantidadDeRaciones){
            
        System.out.println("¡La comida alcanzo!!");
        }
        else
        {
            System.out.println("!La comida no alcanzo!!");
        }
           
    }
    
    public int getCantidadDeRaciones() {
        return cantidadDeRaciones;
    }

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

}
