/*Write a java program to write and Read file using FileWriter and FileReader class */

package lab9;
import java.io.*;
public class FileRW {
    public static void main(String[] args)throws Exception{
        FileWriter f=new FileWriter("java1.txt");
        String s="This text has been written using filewriter.";
        f.write(s);
        f.close();
        System.out.println("Successfully Written the file");
    
    FileReader f1=new FileReader("java.txt");
    int i;
    while((i=f1.read())!=-1){
        char c=(char)i;
        System.out.print(c);
    }
    System.out.println();
    
    }
}
