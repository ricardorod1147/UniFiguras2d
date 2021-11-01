/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ricardo
 */
public class Dibujo {
   
    public static void HacerCirculo(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.BLACK);
        g.fillOval(x, y, ancho, alto);
    }
    public static void HacerCirculoBlanco(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.white);
        g.fillOval(x, y, ancho, alto);
    }
    
    public static void HacerPoligonoYellow(Graphics g,int[]x, int[]y, int i )
    {
        g.setColor(Color.green);
        g.fillPolygon(x, y, i);
    }


}
