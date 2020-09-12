package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        DrawPanel dp = new DrawPanel();

        this.add(dp);
        this.setVisible(true);
    }
}
