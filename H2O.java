/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Erik
 */
public class H2O extends JFrame implements ActionListener {
    private JButton button;
    private JPanel panel;
    private JTextField textfieldx;
    private JTextField textfieldy;
    private JTextArea textarea;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        H2O frame = new H2O();
        frame .setSize(500,400);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,300));
        panel.setBackground(Color.white);
        window.add(panel);
        
        textarea = new JTextArea("x");
        textarea.setOpaque(false);
        window.add(textarea);
        
        textfieldx = new JTextField("200");
        window.add(textfieldx);
        
        textarea = new JTextArea("y");
        textarea.setOpaque(false);
        window.add(textarea);
        
        textfieldy = new JTextField("60");
        window.add(textfieldy);
        
        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        int x;
        x = Integer.parseInt(textfieldx.getText());
        int y;
        y = Integer.parseInt(textfieldy.getText());
        
        Graphics paper = panel.getGraphics();
        paper.setColor(Color.white);
        paper.fillRect(0,0,500,300);
        paper.setColor(Color.black);
        paper.drawLine((x-125), (y-5), (x+50), (y+50));
        paper.drawLine((x-125), (y+105), (x+50), (y+50));
        paper.setColor(Color.blue);
        paper.fillOval((x-150), (y-30), 50, 50);
        paper.fillOval((x-150), (y+80), 50, 50);
        paper.setColor(Color.red);
        paper.fillOval(x, y, 100, 100);
    }
        
    
}
