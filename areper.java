/*Write a java program using swing component to find area and perimeter of rectangle Use text field for inputs and outputs.
Your program should display the result when the user click a button */
package lab9;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class areper implements ActionListener{
JFrame f;
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3,t4;

JButton b1;
public areper(){
    f=new JFrame("Area and Perimeter Calculator.");
    l1=new JLabel("Length");
    l2=new JLabel("Breadth");
    l3=new JLabel("Area");
    l4=new JLabel("Perimeter");
    b1=new JButton("Calculator");
    b1.addActionListener(this);
    t1=new JTextField(30);
    t2=new JTextField(30);
    t3=new JTextField(30);
    t4=new JTextField(30);
    f.setSize(700,400);
       f.setVisible(true);
    f.setLayout(null);
    f.setDefaultCloseOperation(3);
    
    l1.setBounds(20,50,100,20);
    t1.setBounds(130,50,100,20);
    l2.setBounds(20,80,100,20);
    t2.setBounds(130,80,100,20);
    b1.setBounds(80,110,100,20);
    l3.setBounds(20,140,100,20);
    t3.setBounds(130,140,100,20);
    l4.setBounds(20,170,100,20);
    t4.setBounds(130,170,100,20);
    f.add(l1);f.add(l2);f.add(l3);f.add(l4);
    f.add(b1);f.add(t1);f.add(t2);f.add(t3);f.add(t4);
 
}
public void actionPerformed(ActionEvent e){
    float k=Float.parseFloat(t1.getText());
    float l=Float.parseFloat(t2.getText());
    float a=k*l;
    float p=(float)2*(k+l);
    t3.setText(" "+a);
    t4.setText(" "+p);
    
}
public static void main(String[] args){
    new areper();
}
}

    


