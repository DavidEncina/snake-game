
/**
 * Write a description of class SnakeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeGame
{
    // Almacena el lienzo
    private Canvas lienzo;
    // Almacena la serpiente
    private Snake snake;
    // 
    private static final int ANCHO_LIENZO = 300;
    // 
    private static final int ALTO_LIENZO = 300;

    public SnakeGame()
    {
        lienzo = new Canvas("Snake game", ANCHO_LIENZO, ALTO_LIENZO);      
    }    
    
    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake(  )
    {
      snake = new Snake(ANCHO_LIENZO,ALTO_LIENZO);
      lienzo.erase();
      snake.dibujar(lienzo);      
    }
    
    /*
     * Metodo para que se mueva la serpiente
     */
    public void animateSnake()
    {
        snake.borrar(lienzo);
        while(snake.mover()) {
            snake.dibujar(lienzo);
            lienzo.wait(80);
            snake.borrar(lienzo);            
        }
        snake.dibujar(lienzo);
        lienzo.drawString("GAME OVER", 120, 147);
    }
    
    public void startGame()
    {
        
    }
}
