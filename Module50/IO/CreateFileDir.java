package Module50.IO;
import java.io.*;
public class CreateFileDir 
{
    public static void main(String[] args) throws IOException
    {
        // File file1 = new File("pw.txt"); // If ow.txt already on system jvm will start refering to it else it will createa java object
        // System.out.println(file1.exists());// To check if file exist or not: true/false

        //     file1.createNewFile(); //To create file -> throws exception.
        //     System.out.println(file1.exists());

        File dir  = new File("PW");
        System.out.println(dir.exists());

        dir.mkdir(); // To create directory
        System.out.println(dir.exists());
    }
}
