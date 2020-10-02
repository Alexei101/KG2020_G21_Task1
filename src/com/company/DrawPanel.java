package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    Background background = new Background();
    Sun sun = new Sun();
    House house = new House();
    World world = new World();



    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        background.drawBackround(gr, getWidth(), getHeight(), Color.CYAN, Color.GREEN);
       //  world.drawAmountClouds(gr, 9);
        sun.drawSun(gr, 500, 50, 50, 100, 20, Color.orange);
        world.drawBirds(gr, 20);
        world.drawAmountFlowers(gr, 150);
        house.drawHouse(gr, -50, 50, 400, 400, 5, Color.GRAY, Color.BLUE);
        house.drawHouse(gr, 350, 150, 200, 200, 4, Color.GRAY, Color.BLUE);
        world.drawBall(gr, 5);

    }

    public static void draw(Graphics2D gf, int x, int y, int r, int R, int n, Color b) {
        gf.setColor(b);
        gf.fillOval(x - r, y - r, r + 2 * r, r + r);
    }
}


