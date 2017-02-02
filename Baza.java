
/**
 * Write a description of class Baza here.
 * 
 * @author (Luis Gonzalez) 
 * @version (a version number or a date)
 */
public class Baza
{
    
    private int numeroJugadores;
    private int palo;
    private Carta[] baza;
    

    /**
     * Palo que pinta: 0 es oros, 1 es copas, 2 es espadas y 3 es bastos
     */
    public Baza(int numeroJugadores , int paloQuePinta)
    {
        this.numeroJugadores = numeroJugadores;
        this.palo = paloQuePinta;
        baza = new Carta[numeroJugadores];
    }

    public void addCarta (Carta cartaTirada, String nombreJugador){
        int i = 0;
        baza[i] = cartaTirada;
        i++;
    }
    
   
}
