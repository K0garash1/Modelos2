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
    for (Juego juego : arrayJuegos) { 
        //Sustitucion de Lispkov al tratar los juegos como la clase padre Juego
        System.out.println(juego.nombre+" cantidad de jugadores disponibles: "+juego.cantidad_de_jugadores());
    }
}
    
}
