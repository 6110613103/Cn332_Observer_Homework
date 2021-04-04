
import java.awt.Graphics;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noeyyeon
 */
public class Tri {
   int x1 = 60;
    int x2 = 110;
    int x3 = 160;
    int y1 = 100;
    int y2 = 30;
    int y3 = 100;
    
    protected void paintComponent(Graphics g){
    int tx2[] = {x1-20, x2, x3+20};
    int ty2[] = {y1+70, y2+50, y3+70};
    int npoints = 3;
    Polygon t2 = new Polygon(tx2, ty2, npoints);
    g.fillPolygon(t2);}
    
}
