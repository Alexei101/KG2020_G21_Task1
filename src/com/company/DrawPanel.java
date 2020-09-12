package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        drawBackround(gr, getWidth(), getHeight(), Color.CYAN, Color.GREEN);
        drawSun(gr, 500, 50, 50, 100, 20, Color.orange);
        drawHouse(gr, -50, 50, 400, 400, 5, Color.GRAY, Color.BLUE);
        drawHouse(gr, 350, 150, 200, 200, 4, Color.GRAY, Color.BLUE);
    }


    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }

    public static void drawHouse(Graphics2D g, int x, int y, int width, int height, int n, Color c1, Color c2) {
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.setColor(c1);
        g.fillRect(x, y, width, height);
        int floor = height / (n + 1);
        drawTable(g, (int) (x + 1.5 * floor), y + height - floor, floor, floor / 2);
        drawDoor(g, (int) (x + width - 1.5 * floor), y + height - floor, floor, floor);
        int windows = width / floor;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < windows; j++) {
                drawWindow(g, (int) (x + j * floor + 0.1 * floor), (int) (y + height - (2 + i) * floor + 0.1 * floor), (int) (floor * 0.8), (int) (floor * 0.8), c2);
            }
        }
    }

    public static void drawTable(Graphics2D g, int x, int y, int width, int height) {
        int textW = (int) (width * 0.8 / 6);
        int textH = (int) (height * 0.8);
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.drawLine((int) (x + 0.1 * width), (int) (y + 0.1 * height), (int) (x + 0.1 * width + textW / 2), (int) (y + 0.1 * height + textH / 2));
        g.drawLine((int) (x + 0.1 * width + textW), (int) (y + 0.1 * height), (int) (x + 0.1 * width + textW / 2), (int) (y + 0.1 * height + textH));
        g.drawLine((int) (x + 0.1 * width + textW), (int) (y + 0.1 * height + textH), (int) (x + 0.1 * width + textW * 1.5), (int) (y + 0.1 * height + textH * 0.5));
        g.drawLine((int) (x + 0.1 * width + textW * 1.5), (int) (y + 0.1 * height + textH * 0.5), (int) (x + 0.1 * width + textW * 2), (int) (y + 0.1 * height + textH));
        g.fillRect((int) (x + 0.1 * width + textW * 2.5), (int) (y + 0.1 * height + textH * 0.95), (int) (textW * 0.3), (int) (textW * 0.3));
        g.drawLine((int)(x+0.1*width+3*textW), (int)(y+0.1*height),(int)(x+0.1*width+3*textW), (int)(y+0.1*height + textH) );
        g.drawLine((int)(x+0.1*width+4*textW), (int)(y+0.1*height),(int)(x+0.1*width+4*textW), (int)(y+0.1*height + textH) );
        g.drawLine((int)(x+0.1*width+3*textW), (int)(y+0.1*height+0.5*textH),(int)(x+0.1*width+4*textW), (int)(y+0.1*height+0.5*textH));
        g.drawOval((int)(x+0.1*width+4.2*textW), (int)(y+0.1*height+0.5*textH), (int)(0.9*textW), (int)(0.5*textH) );
        g.drawLine((int)(x+0.1*width+5.2*textW), (int)(y+0.1*height+0.5*textH), (int)(x+0.1*width+6.2*textW),  (int)(y+0.1*height+0.5*textH));
        g.drawLine((int)(x+0.1*width+5.6*textW),  (int)(y+0.1*height+0.5*textH), (int)(x+0.1*width+5.6*textW), (int)(y+0.1*height+textH) );
    }


    public static void drawWindow(Graphics2D g, int x, int y, int width, int height, Color c) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.drawLine(x + width / 2, y, x + width / 2, y + height);
        g.drawLine(x, y + height / 2, x + width / 2, y + height / 2);
    }

    public static void drawDoor(Graphics2D g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.drawRect((int) (x + width * 0.8), (int) (y + height / 2), (int) (width * 0.1), (int) (height * 0.1));
    }


    public static void draw(Graphics2D gf, int x, int y, int r, int R, int n, Color b) {
        gf.setColor(b);
        gf.fillOval(x - r, y - r, r + 2 * r, r + r);
    }

    public void drawBackround(Graphics2D g, int width, int height, Color c1, Color c2) {
        int hh = height / 2;
        g.setColor(c1);
        g.fillRect(0, 0, width, hh);
        g.setColor(c2);
        g.fillRect(0, hh, width, hh);
    }

}


