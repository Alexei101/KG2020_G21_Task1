package com.company;

import java.awt.*;

public class Balls implements Drawable {
    int x, y;

    public Balls(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void drawBalls(Graphics2D gr, Color ballColor) {
        gr.setColor(Color.BLACK);
        gr.drawLine(x+25, y+20, x+25, y + 120);
        gr.setColor(ballColor);
        gr.fillOval(x, y, 50, 75);


    }

    private Color ballColor() {
        Color[] color = new Color[]{Color.red, Color.pink, Color.yellow, Color.orange};
        return color[Random.interval(0, color.length - 1)];
    }

    @Override
    public void draw(Graphics2D g) {
        drawBalls(g, ballColor());

    }
}
