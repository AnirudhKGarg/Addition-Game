//Import my libraries
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Random;

public static void main(String[] args) {
new math_tool();
} 

public class math_tool implements ActionListener{
//define most import variable (integers only)
int x=0,y=0;
//define the spcs of the GUI
JTextField tf1;
   JLabel l1,l2,l3,l4;
JButton b1;
  
//function to handle the math and boxes of the window
math_tool(){
   Random rd = new Random();
JFrame f= new JFrame("Math Learning tool");
       x= 1 + rd.nextInt(100);
       y= 1 + rd.nextInt(100);
       l1=new JLabel(String.valueOf(x));
       l1.setBounds(20,20, 100,30);
       l2=new JLabel("+");
       l2.setBounds(70,20, 100,30);
       l3=new JLabel(String.valueOf(y));
       l3.setBounds(100,20, 100,30);
       l4=new JLabel("=");
       l4.setBounds(140,20, 100,30);
tf1=new JTextField();
tf1.setBounds(170,20,130,30);
b1=new JButton("Addition");
b1.setBounds(170,90,130,30);
b1.addActionListener(this);
f.add(tf1);f.add(b1); f.add(l1);f.add(l2);f.add(l3);f.add(l4);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
}   
public void actionPerformed(ActionEvent e)
   {
  
       Random rd = new Random();
       JFrame f = new JFrame("Correctness Check");
       int res=0,x,y;
       try
{
               if(e.getSource()==b1)
               {  
                       String s1=tf1.getText();
                       /* take vale in textbox1*/
                       int a=Integer.parseInt(s1);
                       /* add the random values of labels */
                       res=Integer.parseInt(l1.getText())+Integer.parseInt(l3.getText());
                       /* if matches found */
                       if(res==a)
                       {
                           /* print message */
                           JOptionPane.showMessageDialog(f, "Corect");
                           /* agin take random nuber for labels */
                           x= 1 + rd.nextInt(100);
                           y= 1 + rd.nextInt(100);
                           /* set label values */
                           l1.setText(String.valueOf(x));
                           l3.setText(String.valueOf(y));
                           tf1.setText("");
                           b1.setText("Addition");
                       }
                       /* if match not found */
                       else
                       {
                           JOptionPane.showMessageDialog(f, "Incorrect");
                           /* agin take random nuber for labels */
                           x= 1 + rd.nextInt(100);
                           y= 1 + rd.nextInt(100);
                           /* set label values */
                           l1.setText(String.valueOf(x));
                           l3.setText(String.valueOf(y));
                           tf1.setText("");
                           b1.setText("Try Again");
                       }
               }
       }  
/* number format exception */      
catch (NumberFormatException e1)
{
           tf1.setText("");
       }
}