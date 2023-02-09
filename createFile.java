/*create a fle*/
import java.io.*;
class createFile
{
    public static void main(String[] args){
        File f = new File("D:\\JAVA PRACTICE\\LC.txt");
        try
        {
            if(f.createNewFile())
            {
                System.out.println("File is Successfully created...");
            }
            else
            {
                System.out.println("File already exists!!!");  
            }   
        }
        catch(IOException i)
        {
            System.out.println("Exception Handled!!");
        }
    }
}
 