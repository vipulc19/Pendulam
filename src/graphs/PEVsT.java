package graphs;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class PEVsT extends javax.swing.JPanel 
{

    Stroke drawingStroke = new BasicStroke(2);
    QuadCurve2D curve = new QuadCurve2D.Double(20,30,185,451,350,30);
                        //ctrl x,ctrl y, x1(s),x2,y1(s),y2;
    
    double grav;
    int length, mass;
    double maxPotential;
    public PEVsT(double grav, int length, int mass) 
    {
        initComponents();
        this.grav = grav;
        this.length = length;
        this.mass = mass;
    }

  
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        //set graph XY lines
        g.setColor(Color.BLACK);
        
        g.drawLine(185, 20, 185, 240);
        g.drawLine(20, 240, 370, 240);
        
        g.setColor(Color.BLUE);
        g.drawString("P.E", 177, 20);
        g.drawString("Time", 350, 255);
        
        //drow potential curve
        int x;
        double y;

        Graphics2D ga = (Graphics2D)g;
        ga.setStroke(drawingStroke);
        ga.setPaint(Color.green);
        ga.draw(curve);
        
        //Draw the Maximum point
        maxPotential = mass*grav*length*(1-Math.cos(Math.PI/4))/100;
        g.setColor(Color.black);
        g.drawLine(180, 30, 190, 30);
        g.drawString(Double.toString(maxPotential),192,30);
        
    }
    
    @SuppressWarnings("unchecked")

    private void initComponents() 
    {
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
