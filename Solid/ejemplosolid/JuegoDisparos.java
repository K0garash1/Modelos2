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
 public class JuegoDisparos extends Juego {

        public JuegoDisparos (String nombre) {
            super(nombre);
        }

        @Override
        int cantidad_de_jugadores() {
            return 8;
        }
        
    }