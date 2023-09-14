/*Write a java program to write a sentence "Java is object oriented programming" using file output stream class and read this file using 
FileInputsStream class and find total number of vowel in the file.*/
package lab9;
import java.io.*;
public class StringhanEX {
    public static void main(String[] args) throws Exception{
        FileOutputStream create=new FileOutputStream("java.txt");
        String k="Java is object oriented programming";
        byte[] b=k.getBytes();
        create.write(b);
        create.close();
        System.out.println("File is successfully written");
        
        FileInputStream l=new FileInputStream("java.txt");
        int i=0;
        while((i=l.read())!=-1){
           char c=(char)i;
           if(c=='A' || c=='a' ||c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u'){
               System.out.println(c);
           }
           
            
        }
        l.close();
        
    }
    
}
