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
    public Segment(int posicionX, int posicionY, int direccion)
    {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        color = Color.BLACK;
    }

    /**
     * Dibuja el segmento en un lienzo
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.setForegroundColor(color);
        
        if (direccion == DERECHA) {
            lienzo.drawLine(posicionX, posicionY, posicionX + LONGITUD_SEGMENTO, posicionY);
        }
        
        if (direccion == IZQUIERDA) {
            lienzo.drawLine(posicionX, posicionY, posicionX - LONGITUD_SEGMENTO, posicionY);
        }
        
        if (direccion == ABAJO) {
            lienzo.drawLine(posicionX, posicionY, posicionX, posicionY + LONGITUD_SEGMENTO);
        }
        
        if (direccion == ARRIBA) {
            lienzo.drawLine(posicionX, posicionY, posicionX, posicionY - LONGITUD_SEGMENTO);
        }
    }
    
    /**
     * Borra el lienzo
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.erase();
    }
    
    /**
     * Devuelve la coordenada inicial en el eje horizontal del segmento
     */
    public int getPosicionInicialX()
    {
        return posicionX;
    }
    
    /**
     * Devuelve la coordenada inicial en el eje vertical del segmento
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }
    
    /**
     * Devuelve la coordenada final en el eje horizontal del segmento
     */
    public int getPosicionFinalX()
    {
        int posicionFinalX = 0;
        if (direccion == IZQUIERDA) {
            posicionFinalX = posicionX - LONGITUD_SEGMENTO;
        }
        else {
            posicionFinalX = posicionX + LONGITUD_SEGMENTO;
        }
        return posicionFinalX;
    }
    
    /**
     * Devuelve la coordenada final en el eje vertical del segmento
     */
    public int getPosicionFinalY()
    {
        int posicionFinalY = 0;
        if (direccion == ARRIBA) {
            posicionFinalY = posicionY - LONGITUD_SEGMENTO;
        }
        else {
            posicionFinalY = posicionY + LONGITUD_SEGMENTO;
        }
        return posicionFinalY;
    }
    
    /**
     * Devuelve la direccion del segmento
     */
    public int getDireccion()
    {
        return direccion * DIFERENCIA_DE_GRADOS_ENTRE_DIRECCIONES;
    }
    
    
}
