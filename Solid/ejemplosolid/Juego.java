/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosolid;

/**
 *
 * @author DANIEL
 */
public abstract class Juego {  
        String nombre;

        public Juego(String nombre){ 
            this.nombre = nombre; 
        }

        String getNombreJuego(){ 
            return nombre;
        }
        abstract int cantidad_de_jugadores();
    }