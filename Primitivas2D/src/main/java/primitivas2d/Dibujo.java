/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primitivas2d;
import java.awt.Graphics;
import java.awt.Color;


/**
 *
 * @author Nata
 */
public class Dibujo {
    public static void HacerLinea(Graphics g, int x1, int y1, int x2, int y2)
    {        
        g.setColor(Color.BLACK.brighter());
        g.drawLine(x1,y1,x2,y2);   
    }
    
    public static void HacerCuadroBlue(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.BLUE.brighter());
        g.fillRect (x, y, ancho, alto);
    }
      public static void HacerCuadro(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.WHITE.brighter());
        g.fillRect (x, y, ancho, alto);
    }
    
     public static void HacerCuadroNegro(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.BLACK.brighter());
        g.fillRect (x, y, ancho, alto);
    }
      public static void HacerCuadroMarron(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(new Color(240, 165, 0));
        g.fillRect (x, y, ancho, alto);
    }
    public static void HacerCuadroAmarillo(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.YELLOW.brighter());
        g.fillRect (x, y, ancho, alto);
    }
    public static void HacerCirculo(Graphics g, int x, int y, int ancho, int alto)
    {
        g.drawOval(x, y, ancho, alto);
    }

    public static void HacerPoligonoBlue(Graphics g,int[]x, int[]y, int i )
    {
        g.setColor(new Color(156, 25, 224));
        g.fillPolygon(x, y, i);
    }
    public static void HacerPoligonoYellow(Graphics g,int[]x, int[]y, int i )
    {
        g.setColor(new Color(251, 255, 0));
        g.fillPolygon(x, y, i);
    }
    
    public static void HacerPoligonoNegro(Graphics g,int[]x, int[]y, int i)
    {
        g.setColor(Color.BLACK.brighter());
        g.fillPolygon(x, y, i);
    }
    public static void HacerPoligonoVerde(Graphics g,int[]x, int[]y, int i)
    {
        g.setColor(new Color(110, 203, 99));
        g.fillPolygon(x, y, i);
    }
    public static void HacerPoligonoMarron(Graphics g,int[]x, int[]y, int i)
    {
        g.setColor(new Color(156, 85, 24));
        g.fillPolygon(x, y, i);
    }
    
}
