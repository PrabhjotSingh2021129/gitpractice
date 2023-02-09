/*RENAMING A FILE */
import java.io.*;
public class renameFile {
    public static void main(String[] args) {
        File f=new File("D:\\JAVA PRACTICE\\PS.txt");
        File r=new File("D:\\JAVA PRACTICE\\HS.txt");
        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("file doesnot exists");  
        }
    }
    
}
