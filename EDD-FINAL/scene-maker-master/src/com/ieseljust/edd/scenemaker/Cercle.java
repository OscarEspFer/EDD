package com.ieseljust.edd.scenemaker;

import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends Figures{
    private Integer radi;
    Cercle(int x, int y, int radi, Color color) {
    	super(x,y,color);
    	this.radi = radi;
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
        g.fillOval(getX(), getY(), radi, radi);    // Dibuixem un rectangle en la posició i mida indicades
    };
    @Override
    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("ellipse " + getX() + " " + getY() + " " + radi + " " + getcolor());
    };
}
