import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    // Almacena el tamaño de la galleta
    private static final int DIAMETRO_GALLETA = 10;
    // Posicion inicial en  eje X
    private int posicionX;
    // Posicion inicial en eje Y
    private int posicionY;

    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int posicionX, int posicionY)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;        
    }
}
