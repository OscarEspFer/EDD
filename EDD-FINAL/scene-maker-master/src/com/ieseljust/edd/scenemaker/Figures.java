package com.ieseljust.edd.scenemaker;

import java.awt.Graphics;
import java.awt.Color;

public class Figures implements Renderizable{
	private int x;
	private int y;
	private Color color;
	
	
	Figures(int x, int y, Color color) {
        // Constructor per defecte sense paràmetres
        this.x = x;
        this.y = y;
        this.color = color;
    }
	
	public Integer getX() {
	    return x;
	}

	public Integer getY() {
	    return y;
	}
	
    public void describeMe() {
        
    }
    public void render(Graphics g) {
        g.setColor(this.color);             // Establim el color interior
    }
    public Color getcolor() {
    	return this.color;
    }
}

