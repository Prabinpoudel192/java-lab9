/*Write a java program to develop swing application for student registration (Roll,name,college,Gender,Hobbies and 
Program) form and display the student information in Text Area when user click save button*/
package lab9;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class student implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField f1,f2,f3;
    JTextArea t1;
    JRadioButton b1,b2;
    JCheckBox g1,g2,g3;
    JComboBox ck;
    JButton jb;
    public student(){
        f=new JFrame("Student Registration");
        l1=new JLabel("Roll");
        l2=new JLabel("Name");
        t1=new JTextArea();
        l3=new JLabel("College");
        l4=new JLabel("Gender");
        l5=new JLabel("Hobbies");
        l6=new JLabel("Program");
        f1=new JTextField(50);
        f2=new JTextField(50);
        f3=new JTextField(50);
        b1=new JRadioButton("Male");
        b2=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);bg.add(b2);
        g1=new JCheckBox("Playing");
        g2=new JCheckBox("Reading");
        g3=new JCheckBox("Singing");
        String[] s={"Bca","BIM","BSC.Csit","BE"};
        ck=new JComboBox(s);  
        jb=new JButton("Save");
        jb.addActionListener(this);
    
        f.setSize(1200 ,1000);
         f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(3);
        
        l1.setBounds(20,50,100,20);
        f1.setBounds(130,50,100,20);
        t1.setBounds(500,50,500,500);
        l2.setBounds(20,80,100,20);
        f2.setBounds(130,80,100,20);
        l3.setBounds(20,110,100,20);
        f3.setBounds(130,110,100,20);
        l4.setBounds(20,140,100,20);
        b1.setBounds(130,140,80,20);
        b2.setBounds(210,140,80,20);
        l5.setBounds(20,170,100,20);
        g1.setBounds(130,170,100,20);
        g2.setBounds(240,170,100,20);
        g3.setBounds(350,170,100,20);
        l6.setBounds(20,200,100,20);
        ck.setBounds(130,200,100,20);
        jb.setBounds(100,280,100,20);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(f1);f.add(f2);f.add(f3);
        f.add(b1);f.add(b2);f.add(g1);f.add(g2);f.add(g3);f.add(ck);f.add(t1);f.add(jb);
       
        
    }
    public void actionPerformed(ActionEvent e){
        String a=f1.getText();
        String b=f2.getText();
        String c=f3.getText();
        String d=b1.isSelected()?"male":"Female";
        StringBuilder hobbies=new StringBuilder();
        if(g1.isSelected()){
        hobbies.append("playing");
    }
        if(g2.isSelected()){
            hobbies.append(", Reading");
        }
        if(g3.isSelected()){
            hobbies.append(", Singing");
        }
    
    String program=ck.getSelectedItem().toString();
    t1.setText("Roll:"+a+".\n"+"Name:"+b+".\n"+"College:"+c+".\n"+"Gender:"+d+".\n"+"Hobbies:"+hobbies+".\n"+"Program:"+program+".\n");
}
public static void main(String[] args){
new student();
}}
