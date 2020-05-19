package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Figures{
    /*
     * Aquesta classe representa un element gràfic de tipus rectangle
     */

    private Integer width;
    private Integer height;

    Rectangle(int x, int y, int width, int height, Color color) {
        // Constructor on s'especifica la posició, el color i les dimensions
    	super(x,y,color);
        this.width = width;
        this.height = height;
    }

    // Mètode Accessors


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
        g.fillRect(getX(), getY(), width, height);    // Dibuixem un rectangle en la posició i mida indicades
    };
    @Override
    public void describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        System.out.println("rectangle " + getX() + " " + getY() + " " + width + " " + height + " " + getcolor());
    };
}
