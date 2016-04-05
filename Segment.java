import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    // Almacena la longitud de un segmento
    public static int LONGITUD_SEGMENTO = 50;
    // Almacena la coordenada inicial en el eje horizontal del segmento
    private int posicionX;
    // Almacena la coordenada inicial en el eje vertical del segmento
    private int posicionY;    
    // Almacena el color del segmento
    private Color color;
    // Almacena en lienzo donde se va a dibujar el segmento
    private Canvas lienzo;
    // Almacena en que direccionse va a dibujar el segmento. Se corresponden con 0, 1, 2 y 3
    private int direccion;
    public final static int DERECHA = 0;
    public final static int ABAJO = 1;
    public final static int IZQUIERDA = 2;
    public final static int ARRIBA = 3;
    // Almacena la diferencia en grados que tienen todas las direcciones posibles
    private static final int DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES = 90;

    /**
     * Constructor for objects of class Segment
     */
    public Segment(int posicionX, int posicionY, int direccion, Color color)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        color = Color.BLACK;
    }


}
