/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasCirculos;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;



/**
 *
 * @author Ricardo
 */
public class BeeClass {
    
    public static void HacerLinea(Graphics g, int x1, int y1, int x2, int y2)
    {     
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.BLACK.brighter());
        BasicStroke grosor1 = new BasicStroke(10);
        g2d.setStroke(grosor1);
        g.drawLine(x1,y1,x2,y2);   
    }
    
    public static void HacerCirculoNegro(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, ancho, alto);
    }
    public static void HacerCirculo(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.white);
        g.fillOval(x, y, ancho, alto);
    }
     public static void HacerArcoSky(Graphics g, int x, int y,int alto, int ancho, int altoUno, int anchoUno)
    {
        g.setColor(Color.CYAN);
        g.fillArc(x, y, alto, ancho, altoUno, anchoUno );
    }
     public static void HacerCirculoAmarillo(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, ancho, alto);
    }
    
     public static void HacerArco(Graphics g, int x, int y, int altoUno, int anchoUno, int alto, int ancho)
    {
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(new Color(255, 166, 213));
        BasicStroke grosor1 = new BasicStroke(6);
        g2d.setStroke(grosor1);
        g.fillArc(x, y, altoUno, anchoUno, alto, ancho);
    }
     public static void HacerPoligono(Graphics g,int[]x, int[]y, int i )
    {
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(new Color(254, 228, 64));
        BasicStroke grosor1 = new BasicStroke(6);
        g2d.setStroke(grosor1);
        g.fillPolygon(x, y, i);
    }
     
     public static void HacerPoligonoNegro(Graphics g,int[]x, int[]y, int i )
    {
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.BLACK);
        BasicStroke grosor1 = new BasicStroke(3);
        g2d.setStroke(grosor1);
        g.fillPolygon(x, y, i);
    }
      public static void HacerArcoNegro(Graphics g, int x, int y, int altoUno, int anchoUno, int alto, int ancho)
    {
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.BLACK);
        BasicStroke grosor1 = new BasicStroke(6);
        g2d.setStroke(grosor1);
        g.drawArc(x, y, alto, ancho, ancho, ancho);
    }
  
  
    

    
}
