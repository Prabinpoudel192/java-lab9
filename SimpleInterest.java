/*Write a java program to develop swing application for computing simple Interest using appropriates swing components */
package lab9;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class SimpleInterest implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JButton b1;
    JTextField f1,f2,f3,f4;
    public SimpleInterest(){
   f=new JFrame("SimpleInterest Calculator");
   l1=new JLabel("Principle");
   l2=new JLabel("Rate");
   l3=new JLabel("Time");
   b1=new JButton("Calculate");
   b1.addActionListener(this);
   l4=new JLabel("Simple Interest:");
   f1=new JTextField(30);
   f2=new JTextField(30);
   f3=new JTextField(30);
   f4=new JTextField(30);
   f.setSize(600,600);
   f.setVisible(true);
   f.setDefaultCloseOperation(3);
   f.setLayout(null);
   l1.setBounds(20,50,100,20);
   f1.setBounds(130,50,100,20);
   l2.setBounds(20,80,100,20);
   f2.setBounds(130,80,100,20);
   l3.setBounds(20,110,100,20);
   f3.setBounds(130,110,100,20);
   b1.setBounds(80,140,100,20);
   l4.setBounds(20,170,100,20);
   f4.setBounds(130,170,100,20);
   f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(f1);f.add(f2);f.add(f3);f.add(f4);f.add(b1);
   
    }
    public void actionPerformed(ActionEvent e){
        float p=Float.parseFloat(f1.getText());
        float r=Float.parseFloat(f2.getText());
        float t=Float.parseFloat(f3.getText());
        float si=(p*t*r)/100;
        f4.setText(" "+si);
    }
    public static void main(String[] args){
        new SimpleInterest();
    }
    
}
