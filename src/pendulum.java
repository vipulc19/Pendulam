import java.awt.*;
import javax.swing.*;
 
public class pendulum extends JPanel implements Runnable 
{
    private double angle = Math.PI / 4;
    private int length;
    private double grav;
    private int mass;
    private double time;
    public pendulum(int length, double grav,int mass) 
    {
        this.length = length;
        this.grav = grav;
        this.mass = mass;
        setDoubleBuffered(true);
    }
 
    public void paint(Graphics g) 
    {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        g.setColor(Color.BLACK);
        int anchorX = getWidth() / 2, anchorY = getHeight() / 4;
        int ballX = anchorX + (int) (Math.sin(angle) * length);
        int ballY = anchorY + (int) (Math.cos(angle) * length);
        
        g.drawLine(anchorX, anchorY, ballX, ballY);
        g.fillOval(anchorX - 3, anchorY - 4, 7, 7);
        g.fillOval(ballX - 7, ballY - 7, 14, 14);
        
        time = 2*Math.PI*Math.sqrt((length/100)/grav);
        g.drawString("T = " + time + "s", 10, 20);
    }
 
    public void run() 
    {
        double angleAccel, angleVelocity = 0, dt = 0.1;
        while (true) 
        {
            angleAccel = -grav * mass/ length * Math.sin(angle);
            angleVelocity += angleAccel * dt;
            angle += angleVelocity * dt;
            repaint();
            try { Thread.sleep(15); } catch (InterruptedException ex) {}
        }
    }
 
    @Override
    public Dimension getPreferredSize() 
    {
        return new Dimension(2 * length + 50, length / 2 * 3);
    }
 
    public void pendulamThread(int length, double grav, int mass)
    {
        pendulum p = new pendulum(length,grav,mass);
        new Thread(p).start();
    }
    
}