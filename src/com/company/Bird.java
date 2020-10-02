package com.company;

import java.awt.*;

public class Bird implements Drawable {
    private int x, y;

    @Override
    public void draw(Graphics2D g) {
        drawBirds(g);
    }

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void drawBirds(Graphics2D g){
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x+20, y+20);
        g.drawLine(x+20, y+20, x+40, y);
    }
}

