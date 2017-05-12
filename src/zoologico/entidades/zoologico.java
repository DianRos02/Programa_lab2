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
public class zoologico {
    public static final int CANTIDAD_ANIMALES=25;
    public static final int RACIONES_POR_ANIMAL=5;
    private boolean abierto;
    
    public void abrir(){
        this.abierto=true;
        System.out.println("Abrir Zoologico");
    }
    public void alimentarAnimales(int cantidadDeRaciones){
    Cuidador cui=new Cuidador("Pedro",new Date(1970,11,02),cantidadDeRaciones);
    cui.alimentarAnimales();
            
    }
    public void cerrar(){
        this.abierto=false;
        System.out.println("Cerrar Zoloogico");
       
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
   
    }

