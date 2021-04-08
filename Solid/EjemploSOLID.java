package ejemplosolid;
/**
 *
 * @author DANIEL
 */
public class EjemploSOLID {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Juego[] arrayjuegos = {
            new JuegoTerror("F.E.A.R"),
            new JuegoAventura("Minecraft"),
            new JuegoDisparos("Halo")
    };

    imprimirCantidadDeJugadores(arrayjuegos);
    }
    
    public static void imprimirCantidadDeJugadores(Juego[] arrayJuegos){  
    for (Juego juego : arrayJuegos) { //no estoy seguro si así funciona el for
        //Sustitucion de Lispkov al tratar los juegos como la clase padre Juego
        System.out.println(juego.cantidad_de_jugadores());
    }
}
    
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
    // principio de Abierto cerrado extendiendo la clase Juego
    public static class JuegoTerror extends Juego{
        
        public JuegoTerror(String nombre) {
            super(nombre);
        }

        @Override
        int cantidad_de_jugadores() {
            return 2;
        }
        
    }
    
    public static class JuegoAventura extends Juego {

        public JuegoAventura(String nombre) {
            super(nombre);
        }

        @Override
        int cantidad_de_jugadores() {
            return 1;
        }
        
    }

    public static class JuegoDisparos extends Juego {

        public JuegoDisparos (String nombre) {
            super(nombre);
        }

        @Override
        int cantidad_de_jugadores() {
            return 8;
        }
        
    }
    
//Principio de Responsabilidad única    
class JuegoDB{  
    void guardarJuegoDB(Juego juego){
        
    }
    void eliminarJuegoDB(Juego juego){
        
    }
}
}
