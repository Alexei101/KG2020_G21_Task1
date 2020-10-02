package com.company;

import java.awt.*;

public class Background {
    public void drawBackround(Graphics2D g, int width, int height, Color c1, Color c2) {
        int hh = height / 2;
        g.setColor(c1);
        g.fillRect(0, 0, width, hh);
        g.setColor(c2);
        g.fillRect(0, hh, width, hh);
    }
}
