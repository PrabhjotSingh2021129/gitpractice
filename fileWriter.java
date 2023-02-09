/*WRITE ON A FILE */
import java.io.*;
public class fileWriter {
    public static void main(String[] args){

        try
        { 
            FileWriter f=new FileWriter("D:\\JAVA PRACTICE\\PS.txt");
            try
            {
                f.write("java programming is the best language..!");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully data wrote in file");
        }
        catch(IOException i)
        {
            System.out.println(i);   
        }

    }
}
