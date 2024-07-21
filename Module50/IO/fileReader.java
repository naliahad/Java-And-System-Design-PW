package Module50.IO;

import java.io.*;

public class fileReader {
public static void main(String[] args) throws IOException
{
    File dir =  new File("PW");
    File file =  new File(dir,"pw.txt");

    FileReader fd = new FileReader(file);

    char ch[] = new char[(int)file.length()];

    fd.read(ch);
    for (char data: ch){

        System.out.print(data);
    }

    // int i =fd.read(); // will only give 1st char. To read full data need to use loop. 
    
    // while (i!= -1){
    //     System.out.println(i+"----->"+(char)i); //i will contain ascii number, convert it to char (type cast)
    //     i =fd.read();
    // }
    


}    
}
