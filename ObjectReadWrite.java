package lab9;
/*Write a java program to save 3 student record(such as roll,name,address and Phone Number) into file 
student.txt and display the student record whose address is kritipur*/
import java.io.*;
class student implements Serializable {
int roll;
String name,address,phone;
public student(int r,String n,String a,String p){
    roll=r;
    name=n;
    address=a;
    phone=p;
}
        
    }
public class ObjectReadWrite{
   public static void main(String[] args)throws Exception{
       FileOutputStream fout=new FileOutputStream("Student1.txt");
       ObjectOutputStream out=new ObjectOutputStream(fout);
       student st1=new student(1,"prabin","Gongabu","9862314566");
       student st2=new student(2,"suman","kritipur","9842513678");
       student st3=new student(3,"kapil","kritipur","9823564120");
       student st4=new student(4,"unique","kritipur","9863207842");
       out.writeObject(st1);
       out.writeObject(st2);
       out.writeObject(st3);
       out.writeObject(st4);
       System.out.println("File sucessfully written");
       FileInputStream fin=new FileInputStream("Student1.txt");
       ObjectInputStream oin=new ObjectInputStream(fin);
          try {
            while (true) {
                student student = (student) oin.readObject();
                if (student.address.equals("kritipur")) {
                    System.out.println("Roll: " + student.roll);
                    System.out.println("Name: " + student.name);
                    System.out.println("Address: " + student.address);
                    System.out.println("Phone: " + student.phone);
                    System.out.println();
                }
            }
        } catch (EOFException e) {
        } finally {
            oin.close();
        }
    }
}






    

