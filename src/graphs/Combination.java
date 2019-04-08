
package graphs;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Combination extends javax.swing.JPanel {

    Stroke drawingStroke = new BasicStroke(2);
    QuadCurve2D curvePE = new QuadCurve2D.Double(20,40,185,442,350,40);
    QuadCurve2D curveKE = new QuadCurve2D.Double(20,240,185,-160,350,240);
   
    double grav;
    int length, mass;
    double maxPotential;
    public Combination(double grav, int length, int mass) {
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
        g.drawString("C.E", 177, 20);
        g.drawString("Time", 350, 255);
        
        //double xRatio = 350/time;
        //drow potential corve
        int x;
        double y;
//        for(x=1; x<360; x+=1){
//            y = 239-Math.pow(185-x, 2);//*xRatio;
//            System.out.println(x + " " + y);
//            g.fillOval(5*x-720, (int)y, 2, 2);
//            //try{ Thread.sleep(10); } catch (InterruptedException ex) {}
//        }
        g.setColor(Color.GREEN);
        g.drawLine(20, 40, 350, 40);
        Graphics2D ga = (Graphics2D)g;
        ga.setStroke(drawingStroke);
        ga.setPaint(Color.BLUE);
        ga.draw(curvePE);
        ga.setPaint(Color.RED);
        ga.draw(curveKE);
        
        //Draw the Maximum point
        maxPotential = mass*grav*length*(1-Math.cos(Math.PI/4))/100;
        g.setColor(Color.black);
        g.drawLine(180, 40, 190, 40);
        g.drawString(Double.toString(maxPotential),192,40);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
