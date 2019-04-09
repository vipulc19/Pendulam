
package circularMotion;
import java.awt.*;
import javax.swing.*;

public class pnlCOutput extends JPanel 
{

    double velocity;
    int radius;
    int mass;
    double angle;
    double Tension; 
    public pnlCOutput(double velocity,int radius,int mass,double angle) 
    {
        initComponents();
        this.velocity = velocity;
        this.radius = radius;
        this.mass = mass;
        this.angle = angle; 
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        double radAng = (Math.PI * angle)/180;
        Tension = mass*((Math.pow(velocity, 2)/radius)+(9.81*Math.cos(radAng))); 
        lblOutput.setText(Double.toString(Tension)+"N");
        System.out.println(Math.cos(radAng));
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() 
    {

        jLabel1 = new JLabel();
        lblOutput = new JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("T =");

        lblOutput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOutput.setText("m[((V^2)/r)+cos(a)]");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblOutput))
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblOutput;
    // End of variables declaration//GEN-END:variables
}
