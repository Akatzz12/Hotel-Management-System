
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
    
        HotelManagementSystem(){
            setSize(1366,565);
            setLocation(100,100);
            ImageIcon i1 = new ImageIcon (ClassLoader. getSystemResource ("hotel/management/system/icons/first.jpg"));
            JLabel image = new JLabel(i1);
            add(image);
            
            JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
            text.setBounds(20,430,1000,90);
            text.setForeground(Color.WHITE);
            text.setFont(new Font("Serit",Font.PLAIN, 50));
            image.add(text);
            
            JButton next = new JButton("Next");
            next.setBounds(1150, 450, 150, 50);
            next.setBackground(Color.RED);
            next.setForeground(Color.ORANGE);
            next.addActionListener(this);
            next.setFont(new Font("Serit",Font.PLAIN, 20));
            image.add(next);
                 
            setVisible(true);
            
            while(true){
                text.setVisible(false);
                try{
                    Thread.sleep(500);
                } catch(Exception e){
                    e.printStackTrace();
                }
                text.setVisible(true);
                try{
                    Thread.sleep(500);
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    
         public void actionPerformed(ActionEvent ae){
             setVisible(false);
             new Login();
    
         }
    public static void main(String[] agrs){
     new HotelManagementSystem();
 

        }
}