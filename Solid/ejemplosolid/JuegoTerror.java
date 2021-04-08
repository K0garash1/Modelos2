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
// principio de Abierto cerrado
    public class JuegoTerror extends Juego{
        
        public JuegoTerror(String nombre) {
            super(nombre);
        }

        @Override
        int cantidad_de_jugadores() {
            return 2;
        }
        
    }