package com.company;

import java.awt.*;

public class House {
    public void drawHouse(Graphics2D g, int x, int y, int width, int height, int n, Color c1, Color c2) {
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

    public static void drawDoor(Graphics2D g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.drawRect((int) (x + width * 0.8), (int) (y + height / 2), (int) (width * 0.1), (int) (height * 0.1));
    }

    public static void drawWindow(Graphics2D g, int x, int y, int width, int height, Color c) {
        g.setColor(c);
        g.fillRect(x, y, width, height);
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        g.drawLine(x + width / 2, y, x + width / 2, y + height);
        g.drawLine(x, y + height / 2, x + width / 2, y + height / 2);
    }
}
