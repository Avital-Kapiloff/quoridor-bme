package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.*;

public class Circles extends JPanel
{
    ArrayList<Cirkel> circles = new ArrayList<Cirkel>();

    public void add(Cirkel circle) {
        circles.add(circle);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Cirkel circle: circles) {
            Ellipse2D circle2D = new Ellipse2D.Double();
            
            g2.draw(circle2D);
        }
    }
}
