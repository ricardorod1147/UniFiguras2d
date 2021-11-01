/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PandaAplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Ricardo
 */
public class Panda {
    
    public static void HacerPoligono(Graphics g, int [] x, int [] y, int p)
    {        
        g.setColor(Color.BLACK.brighter());
        g.fillPolygon(x, y, p);
    }
    
    public static void HacerLinea(Graphics g, int x, int y, int p, int o)
    {   
        Graphics2D g2d = (Graphics2D)g;
        BasicStroke grosor1 = new BasicStroke(6);
        g2d.setStroke(grosor1);
        g.setColor(Color.BLACK);
        g.drawLine(x, y, p, o);
    }
    
     public static void Poligono(Graphics g, int [] x, int [] y, int p)
    {        
        Graphics2D g2d = (Graphics2D)g;
        BasicStroke grosor1 = new BasicStroke(6);
        g2d.setStroke(grosor1);
        g.setColor(Color.BLACK.brighter());
        g.drawPolygon(x, y, p);
    }
    
}
