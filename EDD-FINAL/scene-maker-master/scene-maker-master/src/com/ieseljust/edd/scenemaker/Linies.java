package com.ieseljust.edd.scenemaker;

import java.awt.Color;
import java.awt.Graphics;

public class Linies extends Figures{
    private Integer x2;
    private Integer y2;
    Linies(int x, int y, int x2, int y2, Color color) {
    	super(x,y,color);
    	this.x2 = x2;
    	this.y2 = y2;
    }
    @Override
    public void render(Graphics g) {
        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de la cli.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         */
           // Establim el color interior
    	super.render(g);
        g.drawLine(getX(), getY(), x2, y2);    // Dibuixem un rectangle en la posició i mida indicades
    };
    @Override
    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("Linia " + getX() + " " + getY() + " " + x2 + " " +y2+" "+ getcolor());
    };
}
