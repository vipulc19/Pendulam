package graphs;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class TEVsT extends javax.swing.JPanel {

    double grav;
    int length, mass;
    double maxPotential;
    public TEVsT(double grav, int length, int mass) {
        initComponents();
        this.grav = grav;
        this.length = length;
        this.mass = mass;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //set graph XY lines
        g.setColor(Color.BLACK);
        
        g.drawLine(185, 20, 185, 240);
        g.drawLine(20, 240, 370, 240);
        
        g.setColor(Color.BLUE);
        g.drawString("T.E.", 177, 20);
        g.drawString("Time", 350, 255);
        
        int x;
        double y;
        g.setColor(Color.GREEN);
        g.drawLine(20, 120, 350, 120);
        
        //Draw the Maximum point
        maxPotential = (mass*grav*length*(1-Math.cos(Math.PI/4))/100);
        g.setColor(Color.black);
        g.drawLine(180, 120, 190, 120);
        g.drawString(Double.toString(maxPotential),192,120);
    }
  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }
}