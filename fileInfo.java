/*file information */
import java.io.File;
public class fileInfo {
    public static void main(String[] args){
        File f = new File("D:\\JAVA PRACTICE\\LC.txt");
        if(f.exists())
        {
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removes: "+f.delete());
            
        }
        else
        {
            System.out.println("file doesnot exists.");
        }
    }
}
