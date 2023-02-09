/*COPYING ONE FILE DATA TO ANOTHER */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class copyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r=new FileInputStream("D:\\JAVA PRACTICE\\PS.txt");
        FileOutputStream w=new FileOutputStream("D:\\JAVA PRACTICE\\IS.txt");
        int i;
        while((i=r.read())!=-1)
        {
            w.write(i);
        }
        System.out.println("Data is successfully copied..!");
    }
    
}
