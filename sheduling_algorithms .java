import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;

class open implements ActionListener{
    JLabel jl;
    //ongoing personal project
    open(){
        JFrame jf=new JFrame("sheduling_algorithms");
        ImageIcon img = new ImageIcon("img_resources/sheduling_algorithms.png");
        jf.setIconImage(img.getImage());
        jf.setLayout(new FlowLayout());
        jf.setSize(1000,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1=new JButton("ALPHA");
        JButton b2=new JButton("BETA");
        b1.addActionListener(this);
        b2.addActionListener(this);
        jf.add(b1);
        jf.add(b2);
        jl=new JLabel("press button");
        jf.add(jl);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand()=="ALPHA")
            jl.setText("alpha was pressed");
        if(ae.getActionCommand()=="BETA")
            jl.setText("beta was pressed");    
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new open();
            }
        });
    }
}