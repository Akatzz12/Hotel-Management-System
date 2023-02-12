
package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    
    JButton add, cancel;
    JTextField tfname, tfage,  tfcompany ,  tfmodel,  tflocation;
    JComboBox typecombo, availablecombo, gendercombo;
            
    AddDriver(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Driver");
        heading.setFont(new Font("Tohama",Font.BOLD,18));
        heading.setBounds(150, 20, 200, 20);
        add(heading);
        
        JLabel lblroomno = new JLabel("Name ");
        lblroomno.setFont(new Font("Tohama",Font.BOLD,16));
        lblroomno.setBounds(60, 80, 120, 30);
        add(lblroomno);
        
        tfname = new JTextField();
        tfname. setBounds (200, 80, 150, 30);
        add (tfname);
        
        JLabel lblage = new JLabel("Age");
        lblage .setFont(new Font("Tohama",Font.BOLD,16));
        lblage .setBounds(60, 130, 120, 30);
        add(lblage );
        
        tfage = new JTextField();
        tfage. setBounds (200, 130, 150, 30);
        add (tfage);
        
        JLabel lblclean = new JLabel("Gender");
        lblclean.setFont(new Font("Tohama",Font.BOLD,16));
        lblclean.setBounds(60, 180, 120, 30);
        add(lblclean);
        
        String cleanOptions[] = { "Male","Female"};
        gendercombo = new JComboBox(cleanOptions);
        gendercombo.setBounds(200, 180, 150, 30);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);
        
        JLabel lblprice = new JLabel("Car Company ");
        lblprice .setFont(new Font("Tohama",Font.BOLD,16));
        lblprice .setBounds(60, 230, 120, 30);
        add(lblprice);
        
        tfcompany = new JTextField();
        tfcompany . setBounds (200, 230, 150, 30);
        add( tfcompany );
        
        JLabel lblbedtype = new JLabel("Car Model");
        lblbedtype.setFont(new Font("Tohama",Font.BOLD,16));
        lblbedtype.setBounds(60, 280, 120, 30);
        add(lblbedtype);
        
        tfmodel = new JTextField();
        tfmodel . setBounds (200, 280, 150, 30);
        add( tfmodel );
        
        JLabel lblavailable = new JLabel("Available");
        lblavailable.setFont(new Font("Tohama",Font.BOLD,16));
        lblavailable.setBounds(60, 330, 120, 30);
        add(lblavailable);
        
        String driverOptions[] = { "Available","Busy"};
        availablecombo = new JComboBox(driverOptions);
        availablecombo.setBounds(200, 330, 150, 30);
        availablecombo.setBackground(Color.WHITE);
        add(availablecombo);
        
        JLabel lbllocation = new JLabel("Location");
        lbllocation.setFont(new Font("Tohama",Font.BOLD,16));
        lbllocation.setBounds(60, 380, 120, 30);
        add(lbllocation);
        
        tflocation = new JTextField();
        tflocation. setBounds (200, 380, 150, 30);
        add( tflocation );
        
        add = new JButton("Add Driver");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setBounds(500,350,130,30);
        add.addActionListener(this);
        add(add);
        
        cancel = new JButton("Cancel");
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.setBounds(700,350,130,30);
        cancel.addActionListener(this);
        add(cancel);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
        image.setBounds(400, 30, 500, 300);
        add(image);
        
        
        setBounds(300, 200, 980, 470);
        setVisible(true);
        
      
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age = tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company= tfcompany.getText();
            String brand = tfmodel.getText();
            String available = (String) availablecombo.getSelectedItem();
            String location = tflocation.getText();
            try{
               Conn conn = new Conn();
               String query = "insert into driver values('"+name+ "' , '"+age+"', '"+gender+"','"+company+"','"+brand+"','"+available+"','"+location+"')";
               conn.s.executeUpdate(query);
            
            
            JOptionPane.showMessageDialog(null,"New Driver Added Successfully");
            setVisible(false);
            
            }catch (Exception e){
                e.printStackTrace();
            }
            
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddDriver();
        
    }
    
}
