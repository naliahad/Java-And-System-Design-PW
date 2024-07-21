package Module50.IO;
import java.io.*;
public class fileWriter 
{
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("PW");
        File file  = new File (dir, "pw.txt");
        file.createNewFile();
        System.out.println(file.isFile());

        FileWriter fw = new FileWriter(file);
        
        fw.write("java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        fw.write("\n");
        fw.write('h');
        fw.write("\n");
        char ch[] = {'a', 'v', 'c'};
        fw.write(ch);

        fw.write("Ahad");

        //fw.close(); // Important always have to close data in oreder to write the data in file.
                    // Else it will not be written.

        fw.flush(); // flush same as close.

        System.out.println("Open pw.txt to see the result.");


    }
}
