package circularMotion;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle extends JPanel implements Runnable
{
 
    double angle = Math.PI/2;
    double radius;
    
    public Circle(){
        setDoubleBuffered(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(Color.BLACK);
        
        this.radius = (getHeight() - 30)/2;
        int ancherX = 15;
        int ancherY = 15;
        int ballX = ancherX + (int)((radius)*(1-Math.cos(angle)))-5;
        int ballY = ancherY + (int)((radius)*(1-Math.sin(angle)))-5;
        
        //System.out.println(ballX + " " + ballY + " " + radius + " " );
        
        g.drawOval(ancherX, ancherY, (getWidth() - 30), (getHeight() - 30));
        g.drawLine(ancherX, getHeight()/2, (getWidth() - ancherX), getHeight()/2); //X axis 
        g.drawLine(getWidth()/2, ancherY, getWidth()/2, (getHeight()-ancherY));//Y axis
        
        g.setColor(Color.BLUE);
        g.fillOval(ballX, ballY, 10, 10);
        g.drawLine(getWidth()/2, getHeight()/2, ballX+5, ballY+5);
        
        
    }
    
    @Override
    public void run() {
        double centerAccel, Velocity = 10,dt=0.1;
        
        while(true){
            angle +=0.1; 
            
            repaint();
            try { Thread.sleep(100); } catch (InterruptedException ex) {}
        } 
    }
    
    public void circleThread()
    {
        Circle c = new Circle();
        new Thread(c).start();
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 300);
    }
     
   
}
