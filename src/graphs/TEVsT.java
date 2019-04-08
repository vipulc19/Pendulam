
package graphs;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

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
        g.drawString("T.E", 177, 20);
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
        g.drawLine(20, 120, 350, 120);
        
        //Draw the Maximum point
        maxPotential = mass*grav*length*(1-Math.cos(Math.PI/4))/100;
        g.setColor(Color.black);
        g.drawLine(180, 120, 190, 120);
        g.drawString(Double.toString(maxPotential),192,120);
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
