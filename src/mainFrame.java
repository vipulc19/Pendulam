import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.*;
import java.awt.event.*;

public class mainFrame extends JFrame 
{
    private JButton btnGo;
    private ButtonGroup frameSelector;
    private JPanel jPanel1;
    private JLabel lblInput1,lblInput2,lblInput3,lblInput4;
    private JPanel pnlCVsT,pnlKEVsT,pnlModel,pnlOutput,pnlPEVsT,pnlTEVsT;
   
    private JRadioButton rdbCircle,rdbPendulum;
    private JTabbedPane tbGraphs;
    private JTextField txtInput1,txtInput2,txtInput3,txtInput4;

    private pendulum.pendulum pnlPendulum;
    
    private circularMotion.Circle pnlCircle;
    private circularMotion.pnlCOutput pnlCOutput;
    
    private graphs.PEVsT pnlGPEVsT;
    private graphs.KEVsT pnlGKEVsT;
    private graphs.TEVsT pnlGTEVsT;
    private graphs.Combination pnlGCVsT;
        
    double input1;
    int input2;
    int input3;
    double input4;
    /** Creates new form mainFrame */
    public mainFrame() 
    {
        initComponents();
        lblInput3.setVisible(false);
        lblInput4.setVisible(false);
        txtInput3.setVisible(false);
        txtInput4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() 
    {
        frameSelector = new ButtonGroup();
        jPanel1 = new JPanel();
        lblInput1 = new JLabel();
        txtInput1 = new JTextField();
        lblInput2 = new JLabel();
        txtInput2 = new JTextField();
        lblInput3 = new JLabel();
        txtInput3 = new JTextField();
        btnGo = new JButton();
        lblInput4 = new JLabel();
        txtInput4 = new JTextField();
        pnlModel = new JPanel();
        rdbPendulum = new JRadioButton();
        rdbCircle = new JRadioButton();
        pnlOutput = new JPanel();
        tbGraphs = new JTabbedPane();
        pnlPEVsT = new JPanel();
        pnlKEVsT = new JPanel();
        pnlTEVsT = new JPanel();
        pnlCVsT = new JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(BorderFactory.createTitledBorder("Input"));

        lblInput1.setText("Gravitation");

        txtInput1.setName(""); 

        lblInput2.setText("Length");

        lblInput3.setText("Mass");

        btnGo.setText("GO");

        btnGo.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt)
                 {
                    btnGoActionPerformed(evt);
                }   
            });

        lblInput4.setText("Mass");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);   //Used Group Layout
        
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInput1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInput2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInput3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput3, GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInput4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnGo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGo)
                    .addComponent(lblInput2)
                    .addComponent(txtInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput3)
                    .addComponent(txtInput3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInput4)
                    .addComponent(txtInput4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInput1.getAccessibleContext().setAccessibleName("gravitation");

        pnlModel.setMinimumSize(new java.awt.Dimension(300, 300));

        GroupLayout pnlModelLayout = new GroupLayout(pnlModel);
        pnlModel.setLayout(pnlModelLayout);
        pnlModelLayout.setHorizontalGroup(
            pnlModelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        pnlModelLayout.setVerticalGroup(
            pnlModelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        frameSelector.add(rdbPendulum);
        rdbPendulum.setSelected(true);
        rdbPendulum.setText("Pendulum");
        rdbPendulum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rdbPendulumActionPerformed(evt);
            }
        });

        frameSelector.add(rdbCircle);
        rdbCircle.setText("Circle ");
        rdbCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rdbCircleActionPerformed(evt);
            }
        });

        GroupLayout pnlPEVsTLayout = new GroupLayout(pnlPEVsT);
        pnlPEVsT.setLayout(pnlPEVsTLayout);
        pnlPEVsTLayout.setHorizontalGroup(
            pnlPEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlPEVsTLayout.setVerticalGroup(
            pnlPEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("P.E. Vs Time.", pnlPEVsT);

        GroupLayout pnlKEVsTLayout = new GroupLayout(pnlKEVsT);
        pnlKEVsT.setLayout(pnlKEVsTLayout);
        pnlKEVsTLayout.setHorizontalGroup(
            pnlKEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlKEVsTLayout.setVerticalGroup(
            pnlKEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("K.E. Vs Time", pnlKEVsT);

        GroupLayout pnlTEVsTLayout = new GroupLayout(pnlTEVsT);
        pnlTEVsT.setLayout(pnlTEVsTLayout);
        pnlTEVsTLayout.setHorizontalGroup(
            pnlTEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlTEVsTLayout.setVerticalGroup(
            pnlTEVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("T.E. Vs Time", pnlTEVsT);

        GroupLayout pnlCVsTLayout = new GroupLayout(pnlCVsT);
        pnlCVsT.setLayout(pnlCVsTLayout);
        pnlCVsTLayout.setHorizontalGroup(
            pnlCVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        pnlCVsTLayout.setVerticalGroup(
            pnlCVsTLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        tbGraphs.addTab("Combination", pnlCVsT);

        GroupLayout pnlOutputLayout = new GroupLayout(pnlOutput);
        pnlOutput.setLayout(pnlOutputLayout);
        pnlOutputLayout.setHorizontalGroup(
            pnlOutputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbGraphs, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );
        pnlOutputLayout.setVerticalGroup(
            pnlOutputLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addComponent(tbGraphs, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlModel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rdbPendulum)
                        .addGap(18, 18, 18)
                        .addComponent(rdbCircle)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbCircle)
                            .addComponent(rdbPendulum)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(pnlModel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOutput, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("ffff");

        pack();
    }

    private void btnGoActionPerformed(ActionEvent evt) 
    {   
        if(rdbPendulum.isSelected() == true)
        {
            try
            {
                input1 = Double.parseDouble(txtInput1.getText().toString());
                input2 = Integer.parseInt(txtInput2.getText().toString()) * 100;
                //Set mass 
                input3 = 5; //Integer.parseInt(txtInput3.getText().toString());
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid inputs");
            }
            drawPendulum();
        } else if(rdbCircle.isSelected() == true){
           try{
                input1 = Double.parseDouble(txtInput1.getText().toString());
                input2 = Integer.parseInt(txtInput2.getText().toString());
                input3 = Integer.parseInt(txtInput3.getText().toString());
                input4 = Double.parseDouble(txtInput4.getText().toString());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid inputs");
            }
            drawCircle();
        }
        
        //add PEVsT graph to main frame
        if(pnlGPEVsT != null){
            pnlPEVsT.remove(pnlGPEVsT);
        }
        
        pnlGPEVsT = new graphs.PEVsT(input1,input2,input3);
        pnlGPEVsT.setSize(pnlPEVsT.getWidth(), pnlPEVsT.getHeight());
        pnlPEVsT.add(pnlGPEVsT);
        pnlGPEVsT.repaint();
        
        //add PEVsT graph to main frame
        if(pnlGKEVsT != null)
        {
            pnlKEVsT.remove(pnlGPEVsT);
        }
        
        pnlGKEVsT = new graphs.KEVsT(input1,input2,input3);
        pnlGKEVsT.setSize(pnlKEVsT.getWidth(), pnlKEVsT.getHeight());
        pnlKEVsT.add(pnlGKEVsT);
        pnlGKEVsT.repaint();
        
        //add TEVsT graph to main frame
        if(pnlGTEVsT != null){
            pnlTEVsT.remove(pnlGTEVsT);
        }
        
        pnlGTEVsT = new graphs.TEVsT(input1,input2,input3);
        pnlGTEVsT.setSize(pnlTEVsT.getWidth(), pnlTEVsT.getHeight());
        pnlTEVsT.add(pnlGTEVsT);
        pnlGTEVsT.repaint();
        
        //add CombinatiomVsT graph to main frame
        if(pnlGCVsT != null){
            pnlCVsT.remove(pnlGCVsT);
        }
        
        pnlGCVsT = new graphs.Combination(input1,input2,input3);
        pnlGCVsT.setSize(pnlCVsT.getWidth(), pnlCVsT.getHeight());
        pnlCVsT.add(pnlGCVsT);
        pnlGCVsT.repaint();
    }

    private void drawPendulum(){
        //add pandulum panal to main frame
        if(pnlPendulum!=null){
            pnlModel.remove(pnlPendulum);
        }
        if(pnlCircle!=null){
            pnlModel.remove(pnlCircle);
        }
        
        pnlPendulum = new pendulum.pendulum(input2,input1,input3);
        pnlPendulum.pendulamThread(input2,input1,input3);
        pnlPendulum.setSize(pnlModel.getWidth(), pnlModel.getHeight());
        pnlModel.add(pnlPendulum);
        
        new Thread(pnlPendulum).start();
    }
    
    private void drawCircle()
    {
         //add pendulum panal to main frame
        if(pnlCircle!=null)
        {
            pnlModel.remove(pnlCircle);
        }
        if(pnlPendulum!=null)
        {
            pnlModel.remove(pnlPendulum);
        }
        
        pnlCircle = new circularMotion.Circle();
        pnlCircle.circleThread();
        pnlCircle.setSize(pnlModel.getWidth(), pnlModel.getHeight());
        pnlModel.add(pnlCircle);

        new Thread(pnlCircle).start();
        
        //add PEVsT graph to main frame
        if(pnlCOutput != null){
            pnlOutput.remove(pnlCOutput);
        }
        
        pnlCOutput = new circularMotion.pnlCOutput(input1, input2, input3, input4);
        pnlCOutput.setSize(pnlOutput.getWidth(), pnlOutput.getHeight());
        pnlOutput.add(pnlCOutput);
        pnlCOutput.repaint();
    }
    
    private void rdbCircleActionPerformed(java.awt.event.ActionEvent evt) 
    {
        //Setting up interface
        //drawCircle(); 
        if(pnlPendulum!=null){
            pnlModel.remove(pnlPendulum);
        }
        tbGraphs.setVisible(false);
        lblInput1.setText("Velocity");
        lblInput2.setText("Radius");
        lblInput3.setText("Mass");
        lblInput4.setText("Angle");
        lblInput3.setVisible(true);
        lblInput4.setVisible(true);
        txtInput3.setVisible(true);
        txtInput4.setVisible(true);
        txtInput1.setText(null);
        txtInput2.setText(null);
        txtInput3.setText(null);
        txtInput4.setText(null);
        
    }

    private void rdbPendulumActionPerformed(ActionEvent evt) 
    {
        if(pnlCircle!=null){
            pnlModel.remove(pnlCircle);
        }
        tbGraphs.setVisible(true);
        lblInput1.setText("Gravitation");
        lblInput2.setText("Length");
        lblInput3.setVisible(false);
        lblInput4.setVisible(false);
        txtInput3.setVisible(false);
        txtInput4.setVisible(false);
    }

    public static void main(String args[]) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new mainFrame().setVisible(true);
            }
        });
    }
      
}