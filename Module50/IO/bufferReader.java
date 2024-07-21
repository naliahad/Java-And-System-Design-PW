package Module50.IO;
import java.io.*;
public class bufferReader 
{
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("PW");
        File file  =  new File(dir,"pw.txt");

        FileReader fr  =  new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line =br.readLine();

        while (line!= null)
        {

            System.out.println(line );
            line = br.readLine();
        }
        System.out.println("All line done.");
        
    }
}