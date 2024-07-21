package Module50.IO;

import java.io.*;
public class printWriter 
{
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("PW");
        File file = new File(dir, "pw.txt");

        FileWriter fw =  new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("PW");
        pw.println(100);
        pw.println(50.5);
        pw.println('a');
        pw.println(true);
        pw.close();


    }
}
