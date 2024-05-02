/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{

    JLabel JlabClock;
    ClockThread ct;
    
    public DigitalClock (){
        JlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE,80));
        JlabClock.setOpaque(true);
        JlabClock.setBackground(Color.black);
        JlabClock.setForeground(Color.WHITE);
        add(JlabClock);
        setSize(1200,120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
       new DigitalClock();
        
    }
    
}
