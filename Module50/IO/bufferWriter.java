package Module50.IO;
import java.io.*;
public class bufferWriter 
{
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("PW");
        File file  = new File(dir, "pw.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw =  new BufferedWriter(fw); //BufferedReader cannot be used alone.
        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char ch[] = {'p','w','j','s'};
        bw.write(ch);
        bw.flush();
    }
}
